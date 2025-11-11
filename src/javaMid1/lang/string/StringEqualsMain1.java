package javaMid1.lang.string;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교 : "+(str1==str2));
        System.out.println("new String() equals 비교 : "+(str1.equals(str2)));
        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교 : "+(str3==str4));
        System.out.println("리터럴 equals 비교 : "+(str3.equals(str4)));
    }
}
//6페이지이해가 안되는데 강의를 한번 볼까?
//아 이해했다 뭐가 들어올지 모르니까 이퀄스하기 ==이 될때도있는데
// 그냥 이퀄스해

