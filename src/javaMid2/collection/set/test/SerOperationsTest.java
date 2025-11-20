package javaMid2.collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SerOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<Integer>(List.of(3, 4, 5, 6, 7));

//        HashSet<Integer> union = new HashSet<>();
//        for (Integer i : set1) {
//            union.add(i);
//        }
//        for (Integer i : set2) {
//            union.add(i);
//        }
//        System.out.print("합집합 : ");
//        System.out.println(Arrays.asList(union.toArray()));
        Set<Integer>union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer>intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<Integer>difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("union = " + union);
        System.out.println("intersection = " + intersection);
        System.out.println("difference = " + difference);

    }
}
