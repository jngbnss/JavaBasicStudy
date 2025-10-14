package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("입력하세요 : ");
            String s = scanner.nextLine();
            if(s.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                return;
            }else System.out.println("s = " + s);
        }
    }
}
