package javaMid1.enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재하지 않는 등급
        int vip = discountService.discount("VIP",price);
        System.out.println("vip = " + vip);

        // 오타
        int diAMONDD = discountService.discount("DiAMONDD", price);
        System.out.println("diAMONDD = " + diAMONDD);

        //소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold = " + gold);

    }
}
