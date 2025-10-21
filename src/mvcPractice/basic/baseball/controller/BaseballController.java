package mvcPractice.basic.baseball.controller;

import mvcPractice.basic.baseball.model.BaseballGame;
import mvcPractice.basic.baseball.view.BaseballView;

import java.util.List;

public class BaseballController {
    public static void main(String[] args) {
        BaseballView view = new BaseballView();
        BaseballGame game = new BaseballGame();

        boolean isCorrect = false;

        while(!isCorrect){
            List<Integer>guess = view.getUserInput();
            int [] result = game.checkGuess(guess);

            int strike = result[0];
            int ball = result[1];

            view.printResult(strike,ball);
            if(strike==4){
                view.printWinMessage();
                isCorrect = true;
            }
        }
    }
}
/**
 * 몇번 시도했는지
 * 예외처리
 * 정답확인
 * 힌트확인
 * 다시시작하기
 *
 */
