package baekjoon.level4.q10807;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret =0;
        int[]arr = new int[n];

        for(int i=0;i<n;i++){
            int temp = scanner.nextInt();
            arr[i] = temp;
        }
        int v = scanner.nextInt();
        for (int i : arr) {

            if(v==i)ret++;
        }
        System.out.println(ret);
    }
}
