package mvcPractice.mid.cuV1.view;

import java.util.Map;
import mvcPractice.mid.cuV1.model.Order;
import mvcPractice.mid.cuV1.model.Product;

public class ReceiptView {
    public void printReceipt(Order order, int cash) {
        System.out.println("\n====== [ 편의점 영수증 ] ======");
        System.out.println("상품명\t수량\t단가\t합계");
        System.out.println("---------------------------------");
        for (Map.Entry<Product, Integer> e : order.getOrderItems().entrySet()) {
            Product p = e.getKey();
            int qty = e.getValue();
            System.out.printf("%s\t%d\t%d\t%d\n",
                    p.getName(), qty, p.getPrice(), p.getPrice() * qty);
        }
        System.out.println("---------------------------------");
        System.out.println("총 금액: " + order.getTotalPrice() + "원");
        System.out.println("받은 금액: " + cash + "원");
        System.out.println("거스름돈: " + (cash - order.getTotalPrice()) + "원");
        System.out.println("=================================");
        System.out.println("감사합니다! 또 오세요 :)");
    }
}
