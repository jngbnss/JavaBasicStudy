package javaStart.Ch8scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int a = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요:");
        int b = scanner.nextInt();
        if(a>b){
            int temp = a;
            a = b;
            b= temp;
        }
        System.out.print("두 숫자 사이의 모든 정수:");
        for(int i=a;i<b;i++){
            System.out.print(i+",");
        }
        System.out.println(b);


    }
}
