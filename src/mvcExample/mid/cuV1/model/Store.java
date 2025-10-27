package mvcExample.mid.cuV1.model;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) { products.add(p); }
    public List<Product> getProducts() { return products; }

    public Product findByName(String name) {
        for (Product p : products)
            if (p.getName().equalsIgnoreCase(name)) return p;
        return null;
    }
}