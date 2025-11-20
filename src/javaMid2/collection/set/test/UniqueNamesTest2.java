package javaMid2.collection.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        HashSet<Integer> set = new LinkedHashSet<>();
        for (Integer i : inputArr) {
            set.add(i);
        }
        for (Integer i : set) {
            System.out.println( i);
        }
    }
}
