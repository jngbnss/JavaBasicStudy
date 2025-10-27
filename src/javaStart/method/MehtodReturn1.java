package javaStart.method;

public class MehtodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(1);
        System.out.println(result);

    }
    public static boolean odd(int i){
        return i % 2 == 1;
    }
}
