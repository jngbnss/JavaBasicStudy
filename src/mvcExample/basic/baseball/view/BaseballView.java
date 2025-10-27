package mvcExample.basic.baseball.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseballView {
    private Scanner scanner = new Scanner(System.in);
    public List<Integer> getUserInput(){
        System.out.println("숫자를 입력하세요 (예 : 1234)");
        // 문자 예외추가하면 좋겠다
        String input = scanner.nextLine();
        List<Integer> guess = new ArrayList<>();

        for(char c:input.toCharArray()){
            guess.add(c-'0');
        }
        return guess;
    }
    public void printResult(int strike,int ball){
        if(strike ==0&&ball==0){
            System.out.println("낫싱!");
        }else{
            System.out.println(strike+" 스트라이크, "+ball+" 볼!");
        }
    }

    public void printWinMessage(){
        System.out.println("\uD83C\uDF89 정답입니다! 게임 종료 \uD83C\uDF89");
    }
}
