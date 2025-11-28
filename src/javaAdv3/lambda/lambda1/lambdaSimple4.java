package javaAdv3.lambda.lambda1;

public class lambdaSimple4 {
    public static void main(String[] args) {
        MyCall call1 = (int value)->value*2;// 기본
        MyCall call2 = (value -> value*2); // 타입추론
        MyCall call3 = value -> value*2; // 매개변수1개, () 생략 가능
        System.out.println("call3 = "+call3.call(10));

    }
    interface MyCall{
        int call(int value);
    }
}
