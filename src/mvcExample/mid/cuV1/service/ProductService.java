package mvcExample.mid.cuV1.service;

import mvcExample.mid.cuV1.model.Product;
import mvcExample.mid.cuV1.model.Store;

public class ProductService { private Store store;

    public ProductService(Store store) { this.store = store; }

    public void addProduct(String name, int price, int stock) {
        store.addProduct(new Product(name, price, stock));
    }

    public void editProduct(String name, int price, int stock) {
        Product p = store.findByName(name);
        if (p != null) {
            p.setPrice(price);
            p.setStock(stock);
        }
    }

    public void showAllProducts() {
        for (Product p : store.getProducts()) {
            System.out.println(p);
        }
    }
}