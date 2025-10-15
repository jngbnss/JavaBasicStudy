package mvcPractice.basic.simpleCalMvc;

import java.util.Scanner;

public class View {
private Scanner scanner =    new Scanner(System.in);

public double getNumber(String propmt){
    System.out.println(propmt);
    return scanner.nextDouble();
}
public char getOperator(){
    System.out.print("연산자 (+,-,*,/) 입력 : ");
    return scanner.next().charAt(0); //이건 뭐지?
}
    public boolean continueCalculation() {
        while (true) {
            System.out.print("계속 계산하시겠습니까? (y/n): ");
            String input = scanner.next().trim().toLowerCase();
            if (input.equals("y")) return true;
            else if (input.equals("n")) return false;
            else System.out.println("잘못된 입력입니다. y 또는 n만 입력하세요.");
        }
    }
//public boolean continueCalculation(){
//    System.out.print("계속 계산하시겠습니까? (y/n) : ");
//    return scanner.next().equalsIgnoreCase("y");
//    //이건 뭐지 만약 y,n아니면?
//}
public void showResult(double result){
    System.out.println("결과 : "+result);
}
public void showError(String message){
    System.out.println("오류 : "+message);
}

}