package algorithm.week0;
import java.util.*;

public class Combination {
    static int n = 5, r = 3;
    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();
        combi(1, temp);
        System.out.println(result);
    }

    static void combi(int start, List<Integer> temp) {
        if (temp.size() == r) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= n; i++) {
            temp.add(i);            // 선택
            combi(i + 1, temp);     // 다음 숫자로 진행
            temp.remove(temp.size() - 1); // 되돌리기
        }
    }
}
