package mvcPractice.basic.theater.controller;

import mvcPractice.basic.theater.model.TheaterModel;
import mvcPractice.basic.theater.view.TheaterView;

public class TheaterController {
    private TheaterModel model;
    private TheaterView view;

    public TheaterController(TheaterModel model, TheaterView view) {
        this.model = model;
        this.view = view;
    }

    public void run(){
        boolean running = true;
        while(running){
            int choice = view.showMianMenuAndGetChoice();
            switch (choice) {
                case 1 -> handleReserve();
                case 2 -> handleCancel();
                case 3 -> view.printSeatMap(model.getSeats());
                case 4 -> {
                    view.showMessage("프로그램을 종료합니다.");
                    running = false;
                }
                default -> view.showMessage("잘못된 선택입니다. 다시 입력하세요.");
        }
    }
}

    private void handleReserve() {
        String input = view.askForSeatInput();
        if(input.isEmpty()){
            view.showMessage("입력이 비어 있습니다.");
            return;
        }
        String[] seatIds =input.split( "[,\\s]+");
        // 정규표현식 어떻게 하지?
        for (String seatId : seatIds) {
            seatId = seatId.trim();
            if(!model.isValid(seatId)){
                view.showMessage("잘못된 좌석입니다 : "+seatId);
            }else if(model.isReserved(seatId)){
                view.showMessage("은(는) 이미 예약되어 있습니다.");
            }else{
                model.reserve(seatId);
                view.showMessage(seatId + " 예약 성공!");
            }
        }
    }

    private void handleCancel(){
        String input = view.askForSeatInput();
        if(input.isEmpty()){
            view.showMessage("입력이 비어 있습니다.");
            return;
        }
        String[] seatIds = input.split("[,\\s]+");
        for (String seatId : seatIds) {
            seatId = seatId.trim();
            if (!model.isValid(seatId)) {
                view.showMessage("잘못된 좌석입니다: " + seatId);
            } else if (!model.isReserved(seatId)) {
                view.showMessage(seatId + "은(는) 예약되지 않았습니다.");
            } else {
                model.cancel(seatId);
                view.showMessage(seatId + " 예약 취소 완료!");
            }
        }


    }
}
