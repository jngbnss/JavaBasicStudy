package javaStart.Ch8scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("하나의 정수를 입력하세요 : ");

        int age = scanner.nextInt();
        String ret ="짝수";
        if(age%2!=0) ret="홀수";
        System.out.println("입력한 숫자 "+age+"는 "+ret + "입니다.");
    }

}
