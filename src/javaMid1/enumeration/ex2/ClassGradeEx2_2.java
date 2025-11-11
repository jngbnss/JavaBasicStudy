package javaMid1.enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

//        ClassGrade newClassGrade = new ClassGrade();
//        int discount = discountService.discount(newClassGrade, price);
//        System.out.println("discount = " + discount);
    }
}

/**
 * 타입 안전 열거형 패턴의 장점
 * 타입 안정성 향상 정해진 객체만 사용
 * 데이터 일관성 : 정해진 객체만 사용, 데이터 일관성 보장
 *
 * 조금 더 자세히
 * 제한된 인스턴스 생성 : 클래스는 사전에 정의된 몇 개의 인스턴스만 생성하고,
 * 외부에서는 이 인스턴스들만 사용할 수 있도록 한다.
 * 이를 통해 미리 정의된 값들만 사용하도록 보장한다.
 *
 * 타입 안정성 : 이 패턴을 사용하면, 잘못된 값이 할당되거나 사용되는 것을
 * 컴파일 시점에 방지할 수 있다.
 * 여기서는 메서드의 매개변수로 ClassGrade를 사용하는 경우,
 * 앞서 열거한 3개만 사용할 수  있다.
 *
 * 단점 : 많은 코드 작성 ,private생성자 추자 유의
 *
 * 그냥 Enum Type 쓰면 됨!
 */
