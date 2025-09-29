package javaStart.Ch3operator;

public class Operator2 {
    public static void main(String[] args) {
        String result1 = "hello " + "world!";
        String string1 = "string1";
        String string2 = "string2";
        String result2 = string1 + string2;
        System.out.println("result2 = " + result2);

        //문자열과 숫자 더하기1
        String result3 = "a + b = " + 10;
        System.out.println(result3);
        //문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
