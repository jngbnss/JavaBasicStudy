package javaMid1.enumeration.ex1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("vip = " + vip);

        // 오타
        int dia = discountService.discount("DIAMONDD", price);
        System.out.println("dia = " + dia);
        int gold = discountService.discount("gold", price);
        System.out.println("gold = " + gold);
    }

    // 문자열을 막지를 못함
}
