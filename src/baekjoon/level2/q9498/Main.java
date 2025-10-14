package baekjoon.level2.q9498;

import java.util.Scanner;

//9498 시험 성적
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a>=90) System.out.println("A");
        else if(a>=80) System.out.println("B");
        else if(a>=70) System.out.println("C");
        else if(a>=60) System.out.println("D");
        else System.out.println("F");

    }
}
