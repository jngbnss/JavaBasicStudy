package javaMid1.lang.immutable.test;

public class t2 {
    public static void main(String[] args) {
        go(100,3);

    }

    private static void go(int max, int b) {
        for(int i=0;i<=max;i++){
            if (i % b == 0) {
                System.out.println(i);
            }
        }
    }

}
