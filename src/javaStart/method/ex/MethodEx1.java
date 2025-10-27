package javaStart.method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        go(a,b,c);

        int x = 15;
        int y = 25;
        int z = 35;
        go(x,y,z);


    }
    public static void go(int a,int b, int c){
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값: " + average);
    }

}

