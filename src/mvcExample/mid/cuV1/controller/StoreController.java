package mvcExample.mid.cuV1.controller;

import java.util.Map;
import mvcExample.mid.cuV1.model.Cart;
import mvcExample.mid.cuV1.model.Order;
import mvcExample.mid.cuV1.model.Product;
import mvcExample.mid.cuV1.model.Store;
import mvcExample.mid.cuV1.service.PaymentService;
import mvcExample.mid.cuV1.service.ProductService;
import mvcExample.mid.cuV1.view.ReceiptView;
import mvcExample.mid.cuV1.view.StoreView;

public class StoreController {
    private Store store = new Store();
    private ProductService productService = new ProductService(store);
    private PaymentService paymentService = new PaymentService();
    private StoreView view = new StoreView();
    private ReceiptView receiptView = new ReceiptView();
    private Cart cart = new Cart();

    public void run() {
        productService.addProduct("콜라", 1500, 10);
        productService.addProduct("삼각김밥", 1200, 10);
        productService.addProduct("감자칩", 1800, 5);

        while (true) {
            int sel = view.mainMenu();
            if (sel == 1) handleCustomer();
            else if (sel == 2) handleAdmin();
            else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }

    private void handleCustomer() {
        while (true) {
            int sel = view.customerMenu();
            if (sel == 1) productService.showAllProducts();
            else if (sel == 2) {
                String name = view.inputString("상품명 입력: ");
                Product p = store.findByName(name);
                if (p == null) {
                    System.out.println("존재하지 않는 상품입니다.");
                    continue;
                }
                int qty = view.inputInt("수량 입력: ");
                cart.addItem(p, qty);
                System.out.println("장바구니에 담았습니다.");
            } else if (sel == 3) {
                if (cart.isEmpty()) System.out.println("장바구니가 비어있습니다.");
                else {
                    System.out.println("=== 장바구니 ===");
                    for (Map.Entry<Product, Integer> e : cart.getItems().entrySet()) {
                        System.out.println(e.getKey().getName() + " x " + e.getValue());
                    }
                    System.out.println("총 금액: " + cart.getTotalPrice());
                }
            } else if (sel == 4) {
                if (cart.isEmpty()) {
                    System.out.println("장바구니가 비어 있습니다.");
                    continue;
                }
                int cash = view.inputInt("받은 금액 입력: ");
                Order order = paymentService.pay(cart, cash);
                if (order != null) {
                    receiptView.printReceipt(order, cash);
                    cart.clear();
                }
            } else break;
        }
    }

    private void handleAdmin() {
        while (true) {
            int sel = view.adminMenu();
            if (sel == 1) {
                String n = view.inputString("상품명: ");
                int p = view.inputInt("가격: ");
                int s = view.inputInt("재고: ");
                productService.addProduct(n, p, s);
                System.out.println("상품 등록 완료!");
            } else if (sel == 2) {
                String n = view.inputString("수정할 상품명: ");
                int p = view.inputInt("새 가격: ");
                int s = view.inputInt("새 재고: ");
                productService.editProduct(n, p, s);
                System.out.println("상품 수정 완료!");
            } else if (sel == 3) {
                productService.showAllProducts();
            } else break;
        }
    }
}
