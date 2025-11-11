package javaMid1.nested.nested;

import javaMid1.nested.nested.NestedOuter.Nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new Nested();
        nested.print();

        System.out.println("nested.getClass() = " + nested.getClass());

    }
}
