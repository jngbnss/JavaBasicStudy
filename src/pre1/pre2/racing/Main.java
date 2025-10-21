package pre1.pre2.racing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
//        String racers = scanner.nextLine();
//        System.out.println("시도할 횟수는 몇 회인가요?");
//        int cnt = scanner.nextInt();
//        //입력을 배열로 받을수있나? 아니면 그냥 문자열로받고 처리해야하나
//
//        //go();
//        System.out.print("최종 우승자 : ");
//        // 이름 출력하기
//        //view.winners();
        Controller controller = new Controller();
        controller.initRacers();
    }
}
