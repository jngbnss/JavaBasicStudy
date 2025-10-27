package mvcExample.mid.courseRegistration.view;

import java.util.Scanner;

public class view {
    private Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        System.out.println("\n===== 수강신청 시스템 =====");
        System.out.println("1. 학생 등록");
        System.out.println("2. 학생 조회");
        System.out.println("3. 과목 등록");
        System.out.println("4. 과목 조회");
        System.out.println("5. 수강 신청");
        System.out.println("6. 수강 취소");
        System.out.println("7. 시간표 조회");
        System.out.println("0. 종료");
        System.out.print("선택: ");
    }

    public String input(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }
    public void print(String msg){
        System.out.println(msg);
    }
}
