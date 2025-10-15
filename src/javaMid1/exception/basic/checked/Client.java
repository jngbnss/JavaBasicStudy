package javaMid1.exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{
        throw new MyCheckedException("공습경보");
    }
    //throw, throws 차이 주의

}
