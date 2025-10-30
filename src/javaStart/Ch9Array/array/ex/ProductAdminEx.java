package javaStart.Ch9Array.array.ex;


import java.util.Scanner;

public class ProductAdminEx {


    public static void main(String[] args) {
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int cnt =0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");


            int menu = scanner.nextInt();
            scanner.nextLine(); //버퍼 지우기
            if(menu==1) {
                System.out.print("상품 이름을 입력하세요:");
                String name = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요:");
                int price = scanner.nextInt();
                productNames[cnt] = name;
                productPrices[cnt] = price;
                cnt++;
            }else if(menu==2){
                for(int i=0;i<cnt;i++){
                    System.out.println(productNames[i]+": "+productPrices[i]+"원");
                }
            }else if(menu==3){
                System.out.println("프로그램을 종료합니다.");
                return;
            }else {
                System.out.println("잘못된 값을 선택하셨습니다.");
            }

        }

    }

}
