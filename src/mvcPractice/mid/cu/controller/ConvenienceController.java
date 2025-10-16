package mvcPractice.mid.cu.controller;

import mvcPractice.mid.cu.model.CartItem;
import mvcPractice.mid.cu.model.Order;
import mvcPractice.mid.cu.model.Product;
import mvcPractice.mid.cu.view.ReceiptView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvenienceController {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ReceiptView receiptView = new ReceiptView();

    // 상품 리스트
    Product cola = new Product("콜라", 1500,10);
    Product gimbap = new Product("삼각김밥", 1200,5);
    Product chip = new Product("감자칩", 1800,7);

    // 장바구니 담기
    List<CartItem> cart = new ArrayList<>();
    cart.add(new CartItem(cola, 2));
    cart.add(new CartItem(gimbap, 1));
    cart.add(new CartItem(chip, 1));

    // 주문 생성
    Order order = new Order(cart);

    // 결제 입력
    System.out.print("받은 금액 입력: ");
    int paid = sc.nextInt();

    // 영수증 출력
    receiptView.printReceipt(order, paid);
}
}