package mvcPractice.mid.cu.service;

import mvcPractice.mid.cu.model.Product;
import mvcPractice.mid.cu.model.Store;

import java.util.List;

public class ProductService {
    private Store store;

    public ProductService(Store store) {
        this.store = store;
    }

    public void addProduct(String name,int price,int stock){
        store.getProductList().add(new Product(name,price,stock));
    }
    public void editProduct(String name,int newPrice,int newStock){
        Product p = store.findProduct(name);
        if(p!=null){
            p.setPrice(newPrice);
            p.setStock(newStock);
        }else{
            System.out.println("상품을 찾을 수 없습니다.");
        }
    }
    public void deleteProduct(String name){
        Product p = store.findProduct(name);
        if(p!=null) store.getProductList().remove(p);
        else System.out.println("상품을 찾을 수 없습니다. ");
    }
    public List<Product>listProducts(){
        return store.getProductList();
        // 이건 지금 왜 필요한거지?
    }
}
