package javaMid1.lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int idx = str.indexOf(key);
        int count=0;
        while(idx>=0) {
            idx = str.indexOf(key, idx + 1);
            count++;

        }
        System.out.println("count = " + count);
    }

    // 히잉
}