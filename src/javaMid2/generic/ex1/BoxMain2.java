package javaMid2.generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer value = (Integer) integerBox.getValue();
        //Object -> Integer 캐스팅
        System.out.println("value = " + value);

//        StringBox stringBox = new StringBox();
        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        String value1 =(String) stringBox.getValue();
        // Object -> String 캐스팅
        System.out.println("value1 = " + value1);

        // 잘못된 타입의 인수 전달시
        integerBox.setValue("문자100");
        Integer value2 = (Integer) integerBox.getValue();
        System.out.println("value2 = " + value2);
    }
}
