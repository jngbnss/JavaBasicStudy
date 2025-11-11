package javaMid1.nested.inner;

import javaMid1.nested.inner.InnerOuter.Inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        Inner inner = outer.new Inner();
        inner.print();
        System.out.println("inner.getClass() = " + inner.getClass());
    }
}
