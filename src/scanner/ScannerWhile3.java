package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        while(true){
            System.out.print("숫자를 입력하세요 : ");
            int num1 = scanner.nextInt();
            sum+=num1;
            if(num1==0){
                System.out.println("합은 : "+sum);
                System.out.println("프로그램을 종료합니다.");
                return;
            }
        }
    }
}
