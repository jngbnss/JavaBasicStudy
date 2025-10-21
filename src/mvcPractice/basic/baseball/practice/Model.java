package mvcPractice.basic.baseball.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Model {
    //1~9 어떻게 만들면 좋을까
    private List<Integer> answer;
    // 왜 리스트 인티저로 받는게 좋은거지?
    private int cnt;

    public Model() {
        generateAnswer();
    }

    /**
     * 동적으로 추가 가능
     * 중복 검사 용이
     * 리스트는 순서를 유지
     *
     * 배열과 비교
     * 배열도 가능하지만 크기를 미리 지정해야하고, 중복 체크를 하려면 번거로움
     */

    //생성자를 만들어야하나? 일단 답을 만들어보지뭐


    private void generateAnswer(){ // public으로 하기 귀찮긴 하네
        //ArrayList<Object> numbers = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        for(int i=1;i<10;i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        answer = numbers.subList(0,4);

    }

    public List<Integer> getAnswer() {
        return answer;
    }

    //결과 계산을 모델에서 해야하는건가?
    // 모델이 하나밖에 없으니까 일단은 모델에서 처리해보자
    public StrikeBallResultDto checkGuess(List<Integer>guess){
        // 매개변수도 같은 형식으로 받는다는거네?
        // 그냥 문자열로 혹은 숫자로 받을텐데 리스트 형으로 바꿔서 받는다는거지?
        int strike = 0;
        int ball = 0;
        for(int i=0;i<4;i++){
            if(guess.get(i).equals(answer.get(i))){
                strike++;
            }else if(answer.contains(guess.get(i))){
                ball++;
            }
        }
        cnt++;
        return new StrikeBallResultDto(strike,ball,cnt);
    }

}