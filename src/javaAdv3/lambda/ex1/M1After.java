package javaAdv3.lambda.ex1;

public class M1After {

    public static void greeting(String input){
        System.out.println("=== 시작 ===");
        System.out.println("Good "+input);
        System.out.println("=== 끝 ===");
    }

    public static void main(String[] args) {
        greeting("Morning!");
        greeting("Afternoon!");
        greeting("Evening!");
    }
}
