package mvcExample.basic.simpleCalMvc;

public class Model {
    public double calculate(double a, char op, double b)throws ArithmeticException{
        switch(op){
            case '+': return a+b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if(b==0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
                return a/b;
            default:throw new IllegalArgumentException("잘못된 연산자입니다.");

        }
    }
}
