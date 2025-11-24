package javaAdv3.nested.anonymous.ex;

import java.util.Random;
import javaMid2.collection.map.test.cart.Product;

public class Ex1RefMain {
    public static void hello(Process process){
        System.out.println("프로그램 시작");
        //코드 조각 시작
        process.run();

        System.out.println("프로그램 종료");
    }
    static class Dice implements Process{
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("randomValue = " + randomValue);
        }
    }
    static class Sum implements Process{
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Process dice = new Dice();
        Process sum = new Sum();
        hello(dice);
        hello(sum);
    }
}
