package javaStart.Ch8scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = scanner.nextLine(); // 입력을 String으로 가져옵니다.
        System.out.println("str = " + str);

        System.out.print("정수를 입력하세요 : ");
        int intValue = scanner.nextInt();// 입력을 int로 가져옵니다.
        System.out.println("intValue = " + intValue);

        System.out.print("실수를 입력하세요 : ");
        double doubleValue = scanner.nextDouble();// 입력을 double로 가져옵니다.
        System.out.println("doubleValue = " + doubleValue);
    }
}
