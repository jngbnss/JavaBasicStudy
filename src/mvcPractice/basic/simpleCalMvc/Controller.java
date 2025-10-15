package mvcPractice.basic.simpleCalMvc;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run(){
        boolean run = true;
        while(run){
            try{
                double a = view.getNumber("첫 번째 숫자 입력 : ");
                char op = view.getOperator();
                double b = view.getNumber("두 번째 숫자 입력 : ");

                double result = model.calculate(a,op,b);
                view.showResult(result);
            }catch(Exception e){
                view.showError(e.getMessage());
            }
            run = view.continueCalculation();
        }
        System.out.println("프로그램 종료");
    }
}
