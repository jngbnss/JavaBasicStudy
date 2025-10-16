package mvcPractice.mid.cu.controller;

import mvcPractice.mid.cu.model.Cart;
import mvcPractice.mid.cu.model.Customer;
import mvcPractice.mid.cu.model.Product;
import mvcPractice.mid.cu.model.Store;
import mvcPractice.mid.cu.service.PaymentService;
import mvcPractice.mid.cu.service.ProductService;
import mvcPractice.mid.cu.view.StoreView;

public class StoreController {
    //여기 체크 좀
    private Store store = new Store();
    private StoreView view =new StoreView();
    private ProductService productService = new ProductService(store);
    private PaymentService paymentService = new PaymentService();
    private Customer customer = new Customer("주펄");

    public void run() {
        // 테스트용 초기 상품
        productService.addProduct("콜라", 1500, 10);
        productService.addProduct("삼각김밥", 1200, 8);
        productService.addProduct("포카칩", 1800, 5);

        boolean running = true;
        while (running) {
            int choice = view.showMainMenu();
            switch (choice) {
                case 1 -> handleCustomer();
                case 2 -> handleAdmin();
                case 3 -> running = false;
                default -> view.printMessage("잘못된 입력입니다.");
            }
        }
        view.printMessage("프로그램을 종료합니다.");
    }
    private void handleCustomer() {
        boolean back = false;
        while (!back) {
            int choice = view.showCustomerMenu();
            switch (choice) {
                case 1 -> view.showProductList(store.getProductList());
                case 2 -> addToCart();
                case 3 -> showCart();
                case 4 -> {
                    if (customer.getCart().getItems().isEmpty()) {
                        view.printMessage("장바구니가 비어 있습니다.");
                        break;
                    }
                    String method = view.inputString("결제 수단을 입력하세요 (현금/카드): ");
                    int paid = view.inputInt("받은 금액을 입력하세요: ");
                    paymentService.pay(customer.getCart(), method, paid); // 수정된 메서드 호출

                }
                case 5 -> back = true;
                default -> view.printMessage("잘못된 입력입니다.");
            }
        }
    }

    private void addToCart() {
        String name = view.inputString("상품 이름: ");
        int qty = view.inputInt("수량: ");
        Product product = store.findProduct(name);

        if (product == null) {
            view.printMessage("상품이 존재하지 않습니다.");
            return;
        }
        if (qty > product.getStock()) {
            view.printMessage("재고가 부족합니다.");
            return;
        }
        customer.getCart().addItem(product, qty);
        view.printMessage("장바구니에 추가되었습니다!");
    }

    private void showCart() {
        Cart cart = customer.getCart();
        if (cart.getItems().isEmpty()) {
            view.printMessage("장바구니가 비어 있습니다.");
            return;
        }
        System.out.println("\n=== 장바구니 ===");
        cart.getItems().forEach((p, q) ->
                System.out.println(p.getName() + " x " + q + "개"));
        System.out.println("총 금액: " + cart.getTotalPrice() + "원");
    }

    private void handleAdmin() {
        boolean back = false;
        while (!back) {
            int choice = view.showAdminMenu();
            switch (choice) {
                case 1 -> {
                    String name = view.inputString("상품명: ");
                    int price = view.inputInt("가격: ");
                    int stock = view.inputInt("재고: ");
                    productService.addProduct(name, price, stock);
                }
                case 2 -> {
                    String name = view.inputString("수정할 상품명: ");
                    int price = view.inputInt("새 가격: ");
                    int stock = view.inputInt("새 재고: ");
                    productService.editProduct(name, price, stock);
                }
                case 3 -> {
                    String name = view.inputString("삭제할 상품명: ");
                    productService.deleteProduct(name);
                }
                case 4 -> view.showProductList(store.getProductList());
                case 5 -> back = true;
                default -> view.printMessage("잘못된 입력입니다.");
            }
        }
    }
}