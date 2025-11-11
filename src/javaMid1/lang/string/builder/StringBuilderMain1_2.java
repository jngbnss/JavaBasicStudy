package javaMid1.lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = stringBuilder.append("A").append("B").append("C").append("D")
                .insert(4, "JAVA")
                .delete(4, 8)
                .reverse()
                .toString();
        System.out.println("string = " + string);
    }
}
