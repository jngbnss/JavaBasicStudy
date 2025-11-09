package javaMid1.lang.lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

//        str1.parseInt()
        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);
        System.out.println(i1+i2);
        System.out.println(Integer.sum(i1, i2));
    }
}
