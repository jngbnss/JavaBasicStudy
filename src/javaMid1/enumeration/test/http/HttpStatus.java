package javaMid1.enumeration.test.http;

public enum HttpStatus {
    OK(200,"OK"),BAD_REQUEST(400,"Not  Found"),
    NOT_FOUND(404,"Not Found"),INTERNAML_SERVER_ERROR(500,"Internal Server Error");

    private int code;
    private String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int httpCodeInput) {
        if(httpCodeInput>=200||httpCodeInput<300){
            return OK(httpCodeInput,)
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
