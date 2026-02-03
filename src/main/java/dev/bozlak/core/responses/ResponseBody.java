package dev.bozlak.core.responses;

public class ResponseBody {
    private boolean isSuccess;

    public ResponseBody(){}

    public ResponseBody(boolean isSuccess){
        this.isSuccess = isSuccess;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }
}
