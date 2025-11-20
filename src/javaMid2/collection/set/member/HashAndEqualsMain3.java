package javaMid2.collection.set.member;

import javaMid2.collection.set.MyHashSetV2;
import javaMid2.collection.set.MyHashSetV3;
import javaMid2.collection.set.MySet;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>(10);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);
        //검색
        String searchValue = "A";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);
    }
}
