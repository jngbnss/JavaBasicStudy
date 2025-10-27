package mvcExample.basic.lotteryMvc;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run(){
        view.printMessage("로또 번호를 생성합니다 : ");
        model.generateNumber();
        view.printNumbers(model.getAnswer());
    }
}
