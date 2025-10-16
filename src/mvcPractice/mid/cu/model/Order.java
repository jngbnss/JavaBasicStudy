package mvcPractice.mid.cu.model;

import java.util.List;

public class Order {private List<CartItem> items;

    public Order(List<CartItem> items) {
        this.items = items;
    }

    public List<CartItem> getItems() { return items; }

    public int getTotalPrice() {
        int sum = 0;
        for (CartItem item : items) {
            sum += item.getProduct().getPrice() * item.getQuantity();
        }
        return sum;
    }
}