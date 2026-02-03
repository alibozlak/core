package dev.bozlak.core.repository.hibernate;

import dev.bozlak.core.entity.Entity;

public interface EntityRepository<TEntity extends Entity> {

    boolean save(TEntity entity);
}
