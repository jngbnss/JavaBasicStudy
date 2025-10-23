package javaStart.Ch9Array.array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        System.out.print("입력받을 숫자의 개수를 입력하세요 :");
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] students = new int[size];


        System.out.println(size+"개의 정수를 입력하세요");
        for (int i = 0; i < size; i++) {
            int input = scanner.nextInt();
            students[i] = input;
        }
        int min=students[0];
        int max=students[0];
        for (int student : students) {
            min = Math.min(min,student);
            max = Math.max(max,student);
        }
        System.out.println("가장 작은 정수:"+min);
        System.out.println("가장 큰 정수:"+max);
    }
}
