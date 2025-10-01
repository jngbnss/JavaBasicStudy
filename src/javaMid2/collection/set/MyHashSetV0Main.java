package javaMid2.collection.set;

import java.util.Arrays;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println("set = " + set);

        boolean result = set.add(4);
        System.out.println("result = " + result);
        System.out.println("set = " + set);

        System.out.println("set.contains(3): " + set.contains(3)); // O(n)
        System.out.println("set.contains(99): " + set.contains(99)); // O(n)


    }
}
