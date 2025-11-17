package javaMid1.lang.string.testReview;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        // 코드 작성
        int sum = 0;
        int idx = str.indexOf(key);
        while(idx>=0){
            idx = str.indexOf(key,idx+1);
            sum++;
        }
        System.out.println("sum = " + sum);
    }
}
