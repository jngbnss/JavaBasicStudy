package mvcPractice.basic.simpleCal;

public class model {
    private int a;
    private int b;
    private char op;
    private int ret;

    public model(int a, char op, int b) {
        this.a = a;
        this.op = op;
        this.b = b;
    }
    public int calculate(int a, char op, int b){
        if(op=='+') ret = a+b;
        if(op=='*') ret = a*b;
        if(op=='-') ret = a-b;
        if(op=='/') ret = a/b;
        return ret;
    }
}
