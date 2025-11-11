package javaMid1.enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("ClassGrade.BASIC.getClass() = " + ClassGrade.BASIC.getClass());
        System.out.println("ClassGrade.GOLD.getClass() = " + ClassGrade.GOLD.getClass());
        System.out.println("ClassGrade.DIAMOND.getClass() = " + ClassGrade.DIAMOND.getClass());

        System.out.println("ClassGrade.BASIC = " + ClassGrade.BASIC);
        System.out.println("ClassGrade.BASIC = " + ClassGrade.GOLD);
        System.out.println("ClassGrade.BASIC = " + ClassGrade.DIAMOND);
        // 클래스 정보는 모두 같지만, 각각의 상수는 모두 서로 다른 인스턴스를 참조하기 때문에
        // 참조값이 다르게 출력된다.
        // 타입을 사용할 때는 앞서 열거한 상수들만 사용하면 된다.
    }
}
