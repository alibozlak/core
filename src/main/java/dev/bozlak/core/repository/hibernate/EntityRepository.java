package dev.bozlak.core.repository.hibernate;

import dev.bozlak.core.entity.EntityOrDto;

public interface EntityRepository<TEntity extends EntityOrDto> {

    boolean save(TEntity entity);
}
