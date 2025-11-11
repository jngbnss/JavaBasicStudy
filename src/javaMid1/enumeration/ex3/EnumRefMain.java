package javaMid1.enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("Grade.BASIC.getClass() = " + Grade.BASIC.getClass());
        System.out.println("Grade.GOLD.getClass() = " + Grade.GOLD.getClass());

        System.out.println("refValue(Grade.BASIC) = " + refValue(Grade.BASIC));
        System.out.println("refValue(Grade.GOLD) = " + refValue(Grade.GOLD));

    }
    private static String refValue(Object grade){
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
