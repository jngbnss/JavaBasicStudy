package baekjoon.level3.q10950;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        // while(t--){ 이렇게 안됨
        while(t>0){
            int a = scanner.nextInt();
            int  b= scanner.nextInt();
            System.out.println(a+b);
            t--;
        }
    }
}
