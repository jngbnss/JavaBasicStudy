package javaMid2.collection.list.test.ex2;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i <items.size(); i++) {
            System.out.println("상품명: "+items.get(i).getName()+", 합계:"+
                    items.get(i).getTotalPrice());
        }
        System.out.println("전체 가격 합:"+calculateTotalPrice());

    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice+=item.getTotalPrice();
        }
        return totalPrice;
    }
}
