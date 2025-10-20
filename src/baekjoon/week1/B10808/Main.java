package baekjoon.week1.B10808;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        // int [26]arr = new Array();
        int []arr = new int[26];

        //for (Character c : s) {
        for (Character c : s.toCharArray()) {
            arr[c-'a']++;
        }

        for (int i  : arr) {
            System.out.print(i+" ");

        }
    }
}
