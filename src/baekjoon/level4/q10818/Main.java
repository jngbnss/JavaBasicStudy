package baekjoon.level4.q10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mn=1000004;
        int mx=0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int temp = scanner.nextInt();
            mn = Math.min(mn,temp);
            mx = Math.max(mx,temp);
        }
        System.out.println(mn+" "+mx);
    }
}
