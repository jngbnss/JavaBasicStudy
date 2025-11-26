package algorithm.week1;

import java.util.*;

public class combination {
    static int n = 5, k = 3;

    static List<List<Integer>> ret = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> b = new ArrayList<>();
        combi(-1, b);
        print(ret);
    }

    static void combi(int start, List<Integer> b) {
        if (b.size() == k) {
            ret.add(new ArrayList<>(b));
            return;
        }
        for (int i = start + 1; i < n; i++) {
            b.add(i);
            combi(i, b);
            b.remove(b.size() - 1);
        }
    }

    static void print(List<List<Integer>> ret) {
        for (List<Integer> vec : ret) {
            for (Integer x : vec) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
