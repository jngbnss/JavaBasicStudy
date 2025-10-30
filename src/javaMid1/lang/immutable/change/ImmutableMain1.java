package javaMid1.lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10,123);

        ImmutableObj obj2 = obj1.add(20,123);

        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("obj2 = " + obj2.getValue());
        ImmutableObj obj3 = obj2.add(20,1234);
        System.out.println("obj3 = " + obj3.getValue());
        obj3 = obj2.add(20,123);
        System.out.println("obj3 = " + obj3.getValue());
    }
}
