package javaMid2.collection.map.testV1;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        System.out.println("==단어 입력 단계==");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> dict = new HashMap<>();
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String key = scanner.nextLine();
            if(key.equals("q"))break;
            System.out.print("한글  뜻을 입력하세요: ");
            String value = scanner.nextLine();
            dict.put(key, value);
        }
        System.out.println();
        System.out.println("==단어 검색 단계==");
        while(true){
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String key = scanner.nextLine();
            if(key.equals("q"))break;
            if(dict.containsKey(key)){
                System.out.println(key+"의 뜻: "+dict.get(key));

            }else {
                System.out.println(key+"은(는) 사전에 없는 단어입니다.");
            }
            }
    }
}
