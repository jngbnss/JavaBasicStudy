package javaMid2.collection.set.member;

import javaMid2.collection.set.MyHashSetV2;

public class HashAndEqualsMain2_1 {
    public static void main(String[] args) {
        //중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyEq m1 = new MemberOnlyEq("A");
        MemberOnlyEq m2 = new MemberOnlyEq("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 실패
        MemberOnlyEq searchValue = new MemberOnlyEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
