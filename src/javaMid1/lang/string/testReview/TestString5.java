package javaMid1.lang.string.testReview;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        int i = str.indexOf(ext);
        String filename = str.substring(0, i);
        System.out.println("filename = " + filename);
        String extName = str.substring(i);
        System.out.println("extName = " + extName);
    }
}
