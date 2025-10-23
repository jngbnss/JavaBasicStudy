package javaStart.Ch9Array.array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {

        int[][] students = new int[4][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println(i+"번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수 :");
            int input = scanner.nextInt();
            students[i][0] = input;
            System.out.print("영어 점수 :");
            input = scanner.nextInt();
            students[i][1] = input;
            System.out.print("수학 점수 :");
            input = scanner.nextInt();
            students[i][2] = input;
        }

        for (int i = 0; i < 4; i++) {
            int sum=0;
            double avg;
            for (int j = 0; j < 3; j++) {
                sum+=students[i][j];
            }
            avg = (double)sum/3;
            System.out.println(i+"번 학생의 총점: "+sum+", 평균: "+avg);
        }

    }
}
