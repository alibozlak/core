package dev.bozlak.core.responses;

public class ResponseBodyWithObject<T> extends ResponseBody {
    private T object;

    public ResponseBodyWithObject() {
    }

    public ResponseBodyWithObject(T object) {
        super(true);
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
