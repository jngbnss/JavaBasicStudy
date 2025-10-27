package baekjoon.level3.q25304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tot = scanner.nextInt();
        int n = scanner.nextInt();
        int ret =0;
        for(int i=0;i<n;i++){
            int price = scanner.nextInt();
            int quantity = scanner.nextInt();
            ret+=price*quantity;
        }

        if (ret == tot) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
