package mvcExample.mid.cuV1.service;

import mvcExample.mid.cuV1.model.Cart;
import mvcExample.mid.cuV1.model.Order;
import mvcExample.mid.cuV1.model.Product;

public class PaymentService {
    public Order pay(Cart cart, int cash) {
        int total = cart.getTotalPrice();
        if (cash < total) {
            System.out.println("💸 금액이 부족합니다.");
            return null;
        }
        for (Product p : cart.getItems().keySet()) {
            int q = cart.getItems().get(p);
            if (p.getStock() < q) {
                System.out.println("🚫 재고 부족: " + p.getName());
                return null;
            }
            p.reduceStock(q);
        }
        int change = cash - total;
        System.out.println("✅ 결제 완료! 거스름돈: " + change + "원");
        return new Order(cart.getItems(), total);
    }
}
