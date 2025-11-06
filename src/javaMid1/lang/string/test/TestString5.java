package javaMid1.lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        int i = str.indexOf(ext);
        String substring1 = str.substring(0, i);
        System.out.println("substring1 = " + substring1);
        String substring2 = str.substring(i);
        System.out.println("substring2 = " + substring2);
    }
}