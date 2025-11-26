package algorithm.week0;

import java.util.*;

public class Permutation {
    static int n = 5, r = 3;
    static List<List<Integer>> result = new ArrayList<>();
    static boolean[] visited = new boolean[n + 1];

    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();
        perm(temp);
        System.out.println(result);
    }

    static void perm(List<Integer> temp) {
        if (temp.size() == r) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;   // 사용 표시
                temp.add(i);         // 선택
                perm(temp);          // 다음 깊이
                temp.remove(temp.size() - 1); // 제거
                visited[i] = false;  // 사용 해제
            }
        }
    }
}
