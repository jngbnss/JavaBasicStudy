package javaMid1.enumeration.test.http;

public enum HttpStatusSolution {
    OK(200,"OK",true),BAD_REQUEST(400,"Not  Found",false),
    NOT_FOUND(404,"Not Found",false),
    INTERNAML_SERVER_ERROR(500,"Internal Server Error",false);

    private int code;
    private String message;
    private boolean isSuccess;

    HttpStatusSolution(int code, String message, boolean isSuccess) {
        this.code = code;
        this.message = message;
        this.isSuccess = isSuccess;
    }

    public static HttpStatusSolution findByCode(int httpCodeInput) {
        if(httpCodeInput>=200&&httpCodeInput<300){
            return OK;
        }else if(httpCodeInput==400){
            return BAD_REQUEST;
        }else if(httpCodeInput==404){
            return NOT_FOUND;
        }else if(httpCodeInput==500){
            return INTERNAML_SERVER_ERROR;
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return isSuccess;
    }
}
