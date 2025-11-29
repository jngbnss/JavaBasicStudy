package javaAdv3.lambda.ex2;

public class ComposeExample {
    //고차 함수, f1, f2라는 두 함수를 인자로 받아, "f1을 먼저,
//    f2를 나중"에 적용하는 새 함수 반환
    public static MyTransformer compose(MyTransformer f1,MyTransformer f2){

        return new MyTransformer() {
            @Override
            public String transform(String s) {
                String intermediate = f1.transform(s);
                return f2.transform(intermediate);
            }
        };
    }

    public static void main(String[] args) {

        // f1: 대문자로 반환
        MyTransformer toUpper = s->s.toUpperCase();

        // f2 : 앞 뒤에 ** 붙이기
        MyTransformer addDeco = s->"**"+s+"ss";
        //합성 : f1 - > f2를 순서로 적용하는 함수
        MyTransformer composeFunc = compose(toUpper,addDeco);

        // 실행
        String result = composeFunc.transform("hello");
        System.out.println("result = " + result);
    }
}
