package baekjoon.level2.q1330;

import java.util.Scanner;

//1330두수비교하기
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a==b) System.out.println("==");
        else if(a>b) System.out.println(">");
        else if(a<b) System.out.println("<");
    }
}
