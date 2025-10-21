package mvcPractice.basic.baseball.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaseballGame {
    private List<Integer> answer;

    public BaseballGame() {
        generateAnswer();
    }

    private void generateAnswer() {
        List<Integer> numbers = new ArrayList<>();
        // 이거 0도 포함하는거아냐?
        // 여기는 1로 수정하는게 맞아
        //for(int i=0;i<10;i++){
        for(int i=1;i<10;i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        answer = numbers.subList(0,4);
    }
    //결과 계산
    public int[]checkGuess(List<Integer>guess){
        int strike =0;
        int ball = 0;

        for (int i = 0; i < 4; i++) {
            if(guess.get(i).equals(answer.get(i))){
                strike++;
            }else if(answer.contains(guess.get(i))){
                ball++;
            } // 아 이렇게하면 편하긴 하구나
        }
        return new int[]{strike,ball}; // 이건 무슨뜻이지?
    }
    public List<Integer>getAnswer(){
        return answer;
    }
    // 카운트 몇번 걸리는지 알고싶은데


}
