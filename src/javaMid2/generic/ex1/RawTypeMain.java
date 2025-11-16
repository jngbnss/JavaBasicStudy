package javaMid2.generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        integerBox.setValue(10);
        Object value = (Integer) integerBox.getValue();
        System.out.println("value = " + value);
    }
}
