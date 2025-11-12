package javaMid1.nested.annonymous.ex1;

import java.util.Random;
import javaMid1.nested.annonymous.ex.Process;

public class Ex1MainRef {

    public static void hello(Process process){
        System.out.println("시작");
        process.run();
        System.out.println("종료");
    }

    public static class Dice implements Process{
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = "+randomValue);
        }
    }
    public static class Sum implements Process{
        @Override
        public void run() {
            for (int i = 0; i < 4; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        Sum sum = new Sum();
        dice.run();
        sum.run();

    }
}
