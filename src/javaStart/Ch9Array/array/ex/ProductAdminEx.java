//package javaStart.Ch9Array.array.ex;
//
//
//import java.util.Scanner;
//
//public class ProductAdminEx {
//    String[] productNames = new String[10];
//    int[] productPrices = new int[10];
//    int cnt =0;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
//        System.out.print("메뉴를 선택하세요:");
//
//
//        int menu = scanner.nextInt();
//        cnt = 0;
//        switch (menu){
//            case 1:
//                save();
//                break;
//            case 2:
//                list();
//                break;
//            case 3:
//                System.out.println("프로그램을 종료합니다.");
//                return;
//            default:
//                System.out.println("잘못된 값을 선택하셨습니다.");
//        }
//    }
//
//    private static void list() {
//        for(int i=0;i<cnt;i++){
//            System.out.println(productNames[i]+": "+productPrices[i]+"원");
//        }
//    }
//
//    private static void save() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("상품 이름을 입력하세요:");
//        String name = scanner.nextLine();
//        productNames[cnt] =name;
//        int price = scanner.nextInt();
//        productPrices[cnt] = price;
//        cnt++;
//
//
//    }
//}
