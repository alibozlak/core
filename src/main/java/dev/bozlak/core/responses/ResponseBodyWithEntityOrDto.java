package dev.bozlak.core.responses;

import dev.bozlak.core.entity.EntityOrDto;

public class ResponseBodyWithEntityOrDto<T extends EntityOrDto> extends ResponseBody {
    private T entityOrDto;

    public ResponseBodyWithEntityOrDto() {
    }

    public ResponseBodyWithEntityOrDto(T entityOrDto) {
        super(true);
        this.entityOrDto = entityOrDto;
    }

    public T getEntityOrDto() {
        return entityOrDto;
    }

    public void setEntityOrDto(T entityOrDto) {
        this.entityOrDto = entityOrDto;
    }
}
