package javaMid2.collection.map.testV1.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    //정답
    public void add(Product product,int addQ){
        int exisitingQ = cartMap.getOrDefault(product,0);
        cartMap.put(product,exisitingQ+addQ);
    }

    public void minus(Product product,int minusQ){
        int existQ = cartMap.getOrDefault(product,0);

        int newQ = existQ-minusQ;
        if(newQ<=0){
            cartMap.remove(product);
        }else{
            cartMap.put(product,newQ);
        }
    }

    //기본 생성자

//    public void add(Product product, int count) {
//        for (Product key : cartMap.keySet()) {
//            if (product.equals(key)) {
//                int i = cartMap.get(product) + count;
//                cartMap.put(product,i);
//            }
//        }
//        cartMap.put(product, count);
//    }
//
//    public void minus(Product product, int count) {
//        for (Product key : cartMap.keySet()) {
//            if (product.equals(key)) {
//                cartMap.remove(key);
//            }
//        }
//    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product key : cartMap.keySet()) {
            System.out.println("상품: " + key.toString() + " 수량: " + cartMap.get(key));
        }
    }
}
