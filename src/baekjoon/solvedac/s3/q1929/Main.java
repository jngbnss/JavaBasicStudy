package baekjoon.solvedac.s3.q1929;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for(int i=n;i<=m;i++){
            if(go(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean go(int x) {
        if(x<2) return false;
        for(int i=2;i*i<=x;i++){
            if(x%i==0) return false;
        }
        return true;
    }
}
