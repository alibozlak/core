package dev.bozlak.core.responses;

public class ResponseBodyWithMessage extends ResponseBody {
    private String message;

    public ResponseBodyWithMessage() {
    }

    public ResponseBodyWithMessage(boolean isSuccess, String message) {
        super(isSuccess);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}






