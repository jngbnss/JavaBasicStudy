package javaMid1.lang.string.testReview;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] split = email.split("@");
        String ID = split[0];
        System.out.println("ID = " + ID);
        String Domain = split[1];
        System.out.println("Domain = " + Domain);
    }
}
