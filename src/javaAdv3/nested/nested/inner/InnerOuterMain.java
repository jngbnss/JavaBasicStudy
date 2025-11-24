package javaAdv3.nested.nested.inner;

import javaAdv3.nested.nested.inner.InnerOuter.Inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();
        System.out.println("inner.getClass() = " + inner.getClass());
    }
}
