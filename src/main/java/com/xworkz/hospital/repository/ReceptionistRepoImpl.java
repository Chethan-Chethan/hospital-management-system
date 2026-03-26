package com.xworkz.hospital.repository;

import com.xworkz.hospital.entity.ReceptionistEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ReceptionistRepoImpl implements ReceptionistRepo{

    @PersistenceContext
    private EntityManager em;
    @Override
    public boolean save(ReceptionistEntity entity) {
        em.persist(entity);
        return true;
    }
}
