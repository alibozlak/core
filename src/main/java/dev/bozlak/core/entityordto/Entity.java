package dev.bozlak.core.entityordto;

import dev.bozlak.core.entityordto.exceptions.IdMustBePositiveWholeNumberException;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Entity<TId extends Number> {

    private TId id;

    public Entity(TId id) {
        this.setId(id);
    }

    public final void setId(TId id){
        if (
                id instanceof Integer || id instanceof Long || id instanceof Short || id instanceof Byte
        ) {
            if (id.longValue() > 0){
                this.id = id;
                return;
            }
        }

        throw new IdMustBePositiveWholeNumberException();
    }
}
