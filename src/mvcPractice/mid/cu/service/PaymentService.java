package mvcPractice.mid.cu.service;

import mvcPractice.mid.cu.model.Cart;
import mvcPractice.mid.cu.model.Product;
import mvcPractice.mid.cu.model.CartItem;
import mvcPractice.mid.cu.model.Order;
import mvcPractice.mid.cu.view.ReceiptView;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class PaymentService {

    private ReceiptView receiptView = new ReceiptView(); // 영수증 뷰

    public void pay(Cart cart, String method, int paidAmount) {
        int total = cart.getTotalPrice();
        if (total == 0) {
            System.out.println("장바구니가 비어 있습니다.");
            return;
        }

        System.out.println("결제 수단: " + method);
        System.out.println("총 결제 금액: " + total + "원");
        System.out.println("결제가 완료되었습니다.\n");

        // 재고 차감
        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            Product product = entry.getKey();
            int qty = entry.getValue();
            product.setStock(product.getStock() - qty);
        }

        // 영수증 출력
        List<CartItem> orderItems = new ArrayList<>();
        for (Map.Entry<Product, Integer> e : cart.getItems().entrySet()) {
            orderItems.add(new CartItem(e.getKey(), e.getValue()));
        }
        Order order = new Order(orderItems);
        receiptView.printReceipt(order, paidAmount);

        // 장바구니 비우기
        cart.clear();
    }

    // 기존 pay() 메서드 유지 (받은 금액 입력 안할 때)
    public void pay(Cart cart, String method) {
        pay(cart, method, cart.getTotalPrice());
    }
}
