package baekjoon.week1.e1159;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 제거 이게 무슨뜻이지?
        char[]arr = new char[26];
        for(int i=0;i<n;i++){
            String s = scanner.nextLine();
            //char a= s[0]-'a';
            char a = s.charAt(0);
            arr[a-'a']++;
        }
        String ret = "";
        for(int i=0;i<26;i++){
            if(arr[i]>4){
                ret+=(char)(i+'a');
            }
        }
        if (ret.length()>0) {
            System.out.println(ret);
        } else {
            System.out.println("PREDAJA");
        }
    }
}
