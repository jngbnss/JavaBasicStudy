package javaMid2.collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1();
        set.add(1); // O(1)
        set.add(2); // O(1)
        set.add(3); // O(1)
        set.add(4); // O(1)
        set.add(25); // O(1)
        set.add(8); // O(1)
        set.add(14); // O(1)
        set.add(99); // O(1)
        set.add(9); // O(1)
        System.out.println(set);

        //검색
        int searchValue = 9;
        boolean result = set.contains(searchValue);
        System.out.println("set.contains("+searchValue+") = "+result);

        //삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);
        System.out.println(set);

        System.out.println("+++++++++++++");
        result = set.add(4);
        System.out.println("result = " + result);
        System.out.println(set);

        System.out.println("set.contains(3) = " + set.contains(3));
        System.out.println("set.contains(5) = " + set.contains(5));
    }
}
