package baekjoon.solvedac.s3.q3273;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//        Array array = new Array();
//        long n = scanner.nextLong();
        int n = scanner.nextInt();
        long[]array = new long[(int)n];
        for (int i = 0; i < n; i++) {
            //long temp = scanner.nextLong();
//            array.push(temp);
            array[i] = scanner.nextLong();
        }
        long x = scanner.nextLong();

//        array.sort();
        Arrays.sort(array);
        int l=0;
        int r=n-1;
        long ret = 0;
        while(l<r){
            long sum = array[l]+array[r];
            if(sum==x){
                ret++;
                l++;r--;
            }else if(sum<x){
                l++;
            }else r--;
        }
        System.out.println(ret);

    }
}
