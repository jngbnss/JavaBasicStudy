package javaStart.method.ex;
public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        go(3,message);
        go(5,message);
        go(7,message);
    }
    public static void go(int n,String message){
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
