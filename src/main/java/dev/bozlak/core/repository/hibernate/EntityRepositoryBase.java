package dev.bozlak.core.repository.hibernate;

import dev.bozlak.core.entity.EntityOrDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EntityRepositoryBase<TEntity extends EntityOrDto> implements EntityRepository<TEntity>{

    private final SessionFactory sessionFactory;

    public EntityRepositoryBase(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public boolean save(TEntity entity) {
        boolean result = false;

        try (Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
            result = true;
        } catch (Exception e) {
            result = false;
        }

        return result;
    }
}
