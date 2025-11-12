package javaMid1.nested.tested;

import javaMid1.nested.tested.OuterClass2.InnerClass;

public class OuterClass2main {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass inner = outerClass2.new InnerClass();
        inner.hello();
    }
}
