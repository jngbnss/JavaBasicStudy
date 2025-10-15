package mvcPractice.basic.lotteryMvc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Model {
    private List<Integer>answer;

    public void generateNumber(){
        List<Integer>numbers = new ArrayList<>();
        for (int i = 1; i <45 ; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
        answer = new ArrayList<>(numbers.subList(0,6));
        Collections.sort(answer);
    }

    public List<Integer> getAnswer() {
        return answer;
    }
}
