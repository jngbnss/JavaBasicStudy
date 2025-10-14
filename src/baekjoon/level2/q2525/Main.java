package baekjoon.level2.q2525;

import java.util.Scanner;

//사분면 고르기
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();

        h+= a/60;
        m+= a%60;

        if(m>59){
            h+=m/60;
            m = m%60;
        }
        if(h>23) h-=24;
        System.out.println(h+" "+m);

    }
}
