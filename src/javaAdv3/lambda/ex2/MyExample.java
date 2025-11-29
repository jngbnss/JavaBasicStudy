package javaAdv3.lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class MyExample {
    //고차 함수, 함수를 인자로 받아, 리스트의 각 요소를 변환
    public static List<String> map(List<String>list,StringFunction func){

        //코드 작성
        List<String>result = new ArrayList<>();
        for (String val : list) {
            result.add(func.apply(val));
        }
        return result; // 제거하고 적절한 객체를 반환
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: "+words);

        //1. 대문자 변환
        List<String>large = map(words, new StringFunction() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });
        System.out.println("large = " + large);
        //2. 앞뒤에 ** 붙이기 (람다로 작성)
        List<String> add = map(words, s -> ("***" + s + "***"));
        System.out.println("add = " + add);
    }
}
