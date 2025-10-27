package mvcExample.basic.lottery.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Model {
    private List<Integer> answer;

    public Model() {
        List<Integer>numbers=new ArrayList<>();
        for (int i = 1; i < 46; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        answer = numbers.subList(0,6);
    }

    private void generateNumber(){
        List<Integer>numbers=new ArrayList<>();
        for (int i = 1; i < 46; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        answer = numbers.subList(0,6);
    }

    public List<Integer> getAnswer() {
        return answer;
    }
}
