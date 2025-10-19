package baekjoon.week1.c2979;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mx=0;
        int ret =0;
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        //크기가 100인 배열
        int[] arr = new int[100];
        for(int i=0;i<3;i++){
            int s = scanner.nextInt();
            int e = scanner.nextInt();
            mx = Math.max(e,mx);
            for(int j=s;j<e;j++){
                arr[j]++;
            }
        }
        for(int i=0;i<mx;i++){
            if(arr[i]==1) ret+= a;
            else if(arr[i]==2) ret+=b*2;
            else if(arr[i]==3) ret+=3*c;
        }
        System.out.println(ret);

    }
}
