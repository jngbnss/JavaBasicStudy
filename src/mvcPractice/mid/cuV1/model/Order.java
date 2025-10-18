package mvcPractice.mid.cuV1.model;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<Product, Integer> orderItems;
    private int totalPrice;

    public Order(Map<Product, Integer> orderItems, int totalPrice) {
        this.orderItems = new HashMap<>(orderItems);
        this.totalPrice = totalPrice;
    }

    public Map<Product, Integer> getOrderItems() {
        return orderItems;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}