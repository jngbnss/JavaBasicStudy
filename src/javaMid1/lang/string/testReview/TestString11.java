package javaMid1.lang.string.testReview;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        StringBuilder stringBuilder = new StringBuilder();
        String string = stringBuilder.append(str).reverse().toString();
        System.out.println("string = " + string);
    }
}
