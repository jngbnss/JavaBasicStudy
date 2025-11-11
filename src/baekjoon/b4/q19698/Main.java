package baekjoon.b4.q19698;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int n,w,h,l;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int l = scanner.nextInt();
        int ret =0;
        int a = w/l;
        int b = h/l;
        ret = a*b;
        if(ret>n) ret = n;
        System.out.println(ret);
    }
}
