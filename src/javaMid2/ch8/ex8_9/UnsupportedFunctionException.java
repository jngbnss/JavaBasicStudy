package javaMid2.ch8.ex8_9;

public class UnsupportedFunctionException extends RuntimeException{
    final private int ERR_CODE ; //저장값 에러코드는 뭐지?

    public UnsupportedFunctionException(String message, int ERR_CODE) {

        super(message);
        this.ERR_CODE = ERR_CODE;
    }

    public UnsupportedFunctionException(String msg) {
        this(msg,100);
    }

    public int getErrorConde(){
        return ERR_CODE;
    }

//    public String getMessage()({
//
//    })
    public String getMessage() {
        return "["+getErrorConde()+"]"+super.getMessage();
        //Exception.class.getMessage();
    }
}
