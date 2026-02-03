package dev.bozlak.core.repository.hibernate;

import dev.bozlak.core.entity.EntityOrDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EntityRepositoryBase<TEntity extends EntityOrDto> implements EntityRepository<TEntity>{

    @Override
    public boolean save(TEntity entity) {
        boolean result = false;

        try (SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
             Session session = sessionFactory.openSession();){
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
