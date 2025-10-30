package baekjoon.s5.q7785;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, String> log = new HashMap<>();
        Set<String>people = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            String action = scanner.next();

            if(action.equals("enter")){
                people.add(name);
            }else{
                people.remove(name);
            }
        }

        List<String>remain =  new ArrayList<>(people);
        remain.sort(Comparator.reverseOrder());

        for (String s : remain) {
            System.out.println(s);
        }
    }
}
