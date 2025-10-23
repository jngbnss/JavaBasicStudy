package javaStart.Ch9Array.array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] students = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요 :");

        for (int i = 0; i < 5; i++) {
            int input = scanner.nextInt();
            students[i] = input;
        }
        System.out.println("출력");
        for (int i = 4; i >=0; i--) {
            if(i==0) {
                System.out.println(students[i]);
            }else {
                System.out.print(students[i] + ", ");
            }
        }
    }
}
