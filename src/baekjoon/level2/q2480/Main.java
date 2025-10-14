package baekjoon.level2.q2480;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int  c= scanner.nextInt();
        int ret =0;
        if(a==b&&b==c) ret = 10000+a*1000;
        else if(a==b&&b!=c){
            ret = 1000+a*100;
        }else if(a==c&&b!=c){
            ret = 1000+a*100;
        }else if(c==b&&a!=c){
            ret = 1000+b*100;
        }else{
            ret = Math.max(Math.max(a,b),c)*100;
        }
        System.out.println(ret);
    }
}
