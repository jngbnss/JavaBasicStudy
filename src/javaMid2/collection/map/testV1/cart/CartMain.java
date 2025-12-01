package javaMid2.collection.map.testV1.cart;

public class CartMain {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("사과",1000),1);
        cart.add(new Product("바나나",5000),1);

        cart.printAll();

        cart.add(new Product("사과",1000),2);
        cart.printAll();

        cart.minus(new Product("사과",1000),3);
        cart.printAll();

    }
}
