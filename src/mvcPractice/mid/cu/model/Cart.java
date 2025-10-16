package mvcPractice.mid.cu.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product,Integer>items = new HashMap<>();
    public void addItem(Product product,int quantity){
        items.put(product,items.getOrDefault(product,0)+quantity);
    }
    public void clear(){
        items.clear();
    }
    public Map<Product,Integer>getItems(){
        return items;
    }
    public int getTotalPrice(){
        int total =0;
        for (Map.Entry<Product, Integer> e : items.entrySet()) {
            // 이건 무슨 문법이지?
            total += e.getKey().getPrice()*e.getValue();
        }
        return total;
    }

}
