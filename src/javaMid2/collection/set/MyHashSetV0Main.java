package javaMid2.collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1); // O(1)
        set.add(2); // O(1)
        set.add(3); // O(1)
        set.add(4); // O(1)
        System.out.println(set);

        boolean result = set.add(4);
        System.out.println("result = " + result);
        System.out.println(set);

        System.out.println("set.contains(3) = " + set.contains(3));
        System.out.println("set.contains(5) = " + set.contains(5));
    }
}
