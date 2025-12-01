package algorithm.map.q10814;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int age = scanner.nextInt();
            String name = scanner.nextLine();
            map.put(age,name);
        }


    }
}
