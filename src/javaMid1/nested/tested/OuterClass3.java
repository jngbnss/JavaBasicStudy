package javaMid1.nested.tested;

public class OuterClass3 {
    public void myMethod(){
        class LocalClass{
            public void hello(){
                System.out.println("hi");
            }
        }
        LocalClass local = new LocalClass();
        local.hello();
    }
}
