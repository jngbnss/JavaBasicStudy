package javaStart.Ch9Array.array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        System.out.println("입력받을 숫자의 개수를 입력하세요 :");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] students = new int[size];

        System.out.println(size+"개의 정수를 입력하세요");
        for (int i = 0; i < size; i++) {
            int input = scanner.nextInt();
            students[i] = input;
        }
        int sum =0;
        for (int student : students) {
            sum+=student;
        }
        System.out.println("입력한 정수의 합계:"+sum);
        double average = (double)sum/students.length;
        System.out.println("입력한 정수의 평균:"+average);
    }
}
