package dev.bozlak.core.entityordto.exceptions;

public class IdMustBePositiveWholeNumberException extends RuntimeException {

    public IdMustBePositiveWholeNumberException() {
        super("Entity ID must be positive whole number!!");
    }
}
