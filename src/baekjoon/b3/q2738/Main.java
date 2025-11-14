package baekjoon.b3.q2738;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] ints = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ints[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ints[i][j] += scanner.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ints[i][j]+" ");
            }
            System.out.println();
        }
    }
}
