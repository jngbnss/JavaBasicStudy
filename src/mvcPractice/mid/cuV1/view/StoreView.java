package mvcPractice.mid.cuV1.view;

import java.util.Scanner;

public class StoreView {
    private Scanner sc = new Scanner(System.in);

    public int mainMenu() {
        System.out.println("\n=== 편의점 시뮬레이터 ===");
        System.out.println("1. 고객으로 이용하기");
        System.out.println("2. 관리자로 로그인");
        System.out.println("3. 종료");
        System.out.print("선택: ");
        return sc.nextInt();
    }

    public int customerMenu() {
        System.out.println("\n=== 고객 메뉴 ===");
        System.out.println("1. 상품 목록 보기");
        System.out.println("2. 장바구니 담기");
        System.out.println("3. 장바구니 보기");
        System.out.println("4. 결제하기");
        System.out.println("5. 뒤로가기");
        System.out.print("선택: ");
        return sc.nextInt();
    }

    public int adminMenu() {
        System.out.println("\n=== 관리자 메뉴 ===");
        System.out.println("1. 상품 등록");
        System.out.println("2. 상품 수정");
        System.out.println("3. 재고 목록 보기");
        System.out.println("4. 뒤로가기");
        System.out.print("선택: ");
        return sc.nextInt();
    }

    public String inputString(String msg) {
        System.out.print(msg);
        return sc.next();
    }

    public int inputInt(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

}