package javaAdv3.lambda.ex1;

import javaAdv3.lambda.MyFunction;

public class M5Return {
    // operator에 따라 다른 람다(=함수)를 반환
    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        System.out.println("add = " + add.apply(1,2));

        add = getOperation("sub");
        System.out.println("add = " + add.apply(1,2));

        add = getOperation("s");
        System.out.println("add = " + add.apply(1,2));
    }
    public static MyFunction getOperation(String operator){
        switch (operator) {
            case "add":
                return (a , b)->a+b;
            case "sub":
                return(a , b)-> a - b;
            default:
                return (a , b)->0;
        }

    }
}
