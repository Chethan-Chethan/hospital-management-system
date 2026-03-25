package com.xworkz.hospital.repository;

import com.xworkz.hospital.entity.DoctorEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DoctorRepoImpl implements DoctorRepo{

    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean save(DoctorEntity entity) {
        em.persist(entity);
        return true;
    }
}
