package baekjoon.level3.q8393;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret =0;
        for(int i=0;i<=n;i++){
            ret+=i;
        }
        System.out.println(ret);
    }
}
