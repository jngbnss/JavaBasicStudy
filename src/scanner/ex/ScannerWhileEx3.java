package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        int sum =0;
        int cnt =0;
        double avg =0;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: " );
            int price = scanner.nextInt();

            if(price==-1){
                System.out.println("프로그램을 종료합니다.");
                break;
            }


            sum+=price;
            System.out.println("sum = " + sum);
            cnt++;




        }
        avg = (double)sum/cnt;
        System.out.println("입력한 숫자들의 합계:"+sum);
        System.out.println("입력한 숫자들의 평균:"+avg);


    }
}
