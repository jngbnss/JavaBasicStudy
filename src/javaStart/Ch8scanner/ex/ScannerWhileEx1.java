package javaStart.Ch8scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): " );
            String s = scanner.nextLine();

            if(s.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요: " );
            int age = scanner.nextInt();
            System.out.println("입력한 이름 : "+s+", 나이:"+age);

        }

    }
}
