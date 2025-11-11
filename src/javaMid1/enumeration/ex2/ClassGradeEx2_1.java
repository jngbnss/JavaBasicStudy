package javaMid1.enumeration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int discount = discountService.discount(ClassGrade.BASIC, price);
        System.out.println("discount = " + discount);
    }
}
