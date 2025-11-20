package javaMid2.collection.set.test;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : inputArr) {
            set.add(i);
        }
        for (Integer i : set) {
            System.out.println("i = " + i);
        }
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
