package mvcExample.basic.simpleCal;

public class View {
    private String input;
    public void getInput(String input){
        this.input = input;
    }
    public String showResult(){
        return input;
    }
    public String showError(){
        return "올바른 값을 넣어주세요.";
    }
}
