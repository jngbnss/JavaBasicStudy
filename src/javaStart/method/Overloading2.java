package javaStart.method;

public class Overloading2 {
    public static void main(String[] args) {
        myMethod(1,1.2);
        myMethod(1.2,2);
    }

    private static void myMethod(int i, double v) {
        System.out.println("int a, double b");
    }

    private static void myMethod(double v,int i) {
        System.out.println("double a,int double b");
    }

}

