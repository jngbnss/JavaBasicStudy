package mvcPractice.basic.lotteryMvc;

import java.util.List;

public class View {
    public void printMessage(String msg){
        System.out.println(msg);
    }
    public void printNumbers(List<Integer>numbers){
        System.out.println("생성된 로또 번호 : "+numbers);
    }
}
