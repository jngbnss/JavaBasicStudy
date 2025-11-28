package javaAdv3.lambda.lambda2;

import javaAdv3.lambda.MyFunction;

public class LambdaPassMain3 {
    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        System.out.println("add.apply(1,2) = " + add.apply(1, 2));

        add = getOperation("sub");
        System.out.println("add.apply(1,2) = " + add.apply(1, 2));

        add = getOperation("s");
        System.out.println("add.apply(1,2) = " + add.apply(1, 2));
    }

    private static MyFunction getOperation(String operation) {
        switch (operation){
            case "add":
                return(a,b)->a+b;
            case "sub":return(a,b)->a-b;
            default:return(a,b)->0;

        }
    }


}
