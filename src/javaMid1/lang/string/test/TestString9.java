package javaMid1.lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example@com";
        String[] parts = email.split("@");
        String part = parts[0];
        System.out.println("part = " + part);
        String part1 = parts[1];
        System.out.println("part1 = " + part1);
    }
    //호옹이
}