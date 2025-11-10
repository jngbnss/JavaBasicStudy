package baekjoon.b4.q21964;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String s = scanner.next();
//        scanner.nextLine();
        int cnt = i-5;
//        System.out.println(cnt);
        String substring = s.substring(cnt);
//        System.out.println(s.substring(cnt));
        System.out.println(substring);
    }
}
