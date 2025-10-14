package baekjoon.level2.q2753;

import java.util.Scanner;

//윤년
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int ret = 0;
        if(a%4==0){
            if(a%100!=0||a%400==0) ret = 1;
        }
        System.out.println(ret);

    }
}
