package mvcPractice.mid.cu.view;

import mvcPractice.mid.cu.model.Product;

import java.util.List;
import java.util.Scanner;

public class StoreView {
    private Scanner scanner = new Scanner(System.in);

    public int showMainMenu() {
        System.out.println("\n=== 편의점 시뮬레이터 ===");
        System.out.println("1. 고객으로 이용하기");
        System.out.println("2. 관리자로 로그인");
        System.out.println("3. 종료");
        System.out.print("선택: ");
        return scanner.nextInt();
    }


    public int showCustomerMenu() {
        System.out.println("\n=== 고객 메뉴 ===");
        System.out.println("1. 상품 목록 보기");
        System.out.println("2. 장바구니 담기");
        System.out.println("3. 장바구니 보기");
        System.out.println("4. 결제하기");
        System.out.println("5. 뒤로가기");
        System.out.print("선택: ");
        return scanner.nextInt();
    }

    public int showAdminMenu() {
        System.out.println("\n=== 관리자 메뉴 ===");
        System.out.println("1. 상품 등록");
        System.out.println("2. 상품 수정");
        System.out.println("3. 상품 삭제");
        System.out.println("4. 재고 목록 보기");
        System.out.println("5. 뒤로가기");
        System.out.print("선택: ");
        return scanner.nextInt();
    }
    public String inputString(String msg){
        System.out.println(msg);
        return scanner.next();
    }
    public int inputInt(String msg){
        System.out.println(msg);
        return scanner.nextInt();
    }
    public void showProductList(List<Product> list){
        if(list.isEmpty()) System.out.println("등록된 상품이 없습니다.");
        else {
            System.out.println("\n=== 상품 목록 ===");
            for (Product p : list) System.out.println(p);
        }
    }
    public void printMessage(String msg){
        System.out.println(msg);
    }
    public String inputAdminPassword(String msg){
        System.out.println(msg);
        return scanner.next();
    }



}
