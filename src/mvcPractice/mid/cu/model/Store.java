package mvcPractice.mid.cu.model;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product>productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }
    public Product findProduct(String name){
        for(Product p:productList){
            if(p.getName().equalsIgnoreCase(name)) return p;
        }
        return null;
    }
}
