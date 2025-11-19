package javaMid2.collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int i = scanner.nextInt();
            if (i == 0) {
                break;
            }
            list.add(i);
        }
        for (Integer i : list) {
            sum+=i;
        }
        double average = (double)sum/list.size();
        System.out.print("입력한 정수의 합계:");
        System.out.println(sum);
        System.out.print("입력한 정수의 평균:");
        System.out.println(average);

    }
}
