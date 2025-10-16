package mvcPractice.mid.cu.view;

import mvcPractice.mid.cu.model.CartItem;
import mvcPractice.mid.cu.model.Order;

import java.text.DecimalFormat;
import java.util.List;

public class ReceiptView {

    public void printReceipt(Order order, int paidAmount) {
        DecimalFormat df = new DecimalFormat("#,###");
        List<CartItem> items = order.getItems();

        System.out.println("\n====== [ 편의점 영수증 ] ======");
        System.out.printf("%-10s %5s %8s %8s\n", "상품명", "수량", "단가", "합계");
        System.out.println("---------------------------------");

        for (CartItem item : items) {
            String name = item.getProduct().getName();
            int quantity = item.getQuantity();
            int price = item.getProduct().getPrice();
            int total = price * quantity;

            System.out.printf("%-10s %5d %8s %8s\n",
                    name, quantity, df.format(price), df.format(total));
        }

        System.out.println("---------------------------------");
        System.out.printf("%-15s %10s원\n", "총 금액:", df.format(order.getTotalPrice()));
        System.out.printf("%-15s %10s원\n", "받은 금액:", df.format(paidAmount));
        System.out.printf("%-15s %10s원\n", "거스름돈:", df.format(paidAmount - order.getTotalPrice()));
        System.out.println("=================================");
        System.out.println("감사합니다! 또 오세요 :)");
    }
}