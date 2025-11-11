package javaMid1.enumeration.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, price);
        System.out.println("basic = " + basic);
        int Gold = discountService.discount(StringGrade.GOLD, price);
        System.out.println("Gold = " + Gold);
        int discount = discountService.discount(StringGrade.DIAMOND, price);
        System.out.println("discount = " + discount);
    }
}
