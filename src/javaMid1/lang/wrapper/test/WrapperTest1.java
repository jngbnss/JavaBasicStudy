package javaMid1.lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int sums = num1+num2;
        System.out.println("두 수의 합: "+sums);

        int sum = Integer.valueOf(str1) + Integer.valueOf(str2);
        System.out.println("sum = " + sum);

    }
}
