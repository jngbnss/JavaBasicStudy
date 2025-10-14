package baekjoon.level2.q14681;

import java.util.Scanner;

//사분면 고르기
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int ret = 3;
        if(x>0){
            if(y>0) ret = 1;
            else ret =4;
        }else{
            if(y>0) ret=2;
        }
        System.out.println(ret);

    }
}
