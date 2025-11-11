package javaMid1.enumeration.ref3;

public class EnumRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;
        System.out.println("Grade.BASIC.discount(price) = " + Grade.BASIC.discount(price));
        printDiscount(Grade.GOLD,price);
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(
                grade.name()+" 등급의 할인  금액 : "+
                        grade.discount(price)
        );
    }
}
