package javaAdv3.nested.nested;

import javaAdv3.nested.nested.NestedOuter.Nested;

public class NestedOuterMain {
    public static void main(String[] args) {

        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nested.getClass() = " + nested.getClass());
    }
}
