package javaMid1.lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A");
        stringBuilder.append("B");
        stringBuilder.append("C");
        stringBuilder.append("D");
        System.out.println("stringBuilder = " + stringBuilder);

        stringBuilder.insert(4,"Java");
        System.out.println("stringBuilder = " + stringBuilder);
        stringBuilder.delete(4,8);
        System.out.println("stringBuilder = " + stringBuilder);
        stringBuilder.reverse();
        System.out.println("stringBuilder = " + stringBuilder);
        String string = stringBuilder.toString();
        System.out.println("string = " + string);
    }
}
