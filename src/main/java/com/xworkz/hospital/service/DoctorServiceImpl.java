package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.DoctorDto;
import com.xworkz.hospital.entity.DoctorEntity;
import com.xworkz.hospital.repository.DoctorRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    private DoctorRepo doctorRepo;
    @Override
    @Transactional
    public boolean save(DoctorDto dto) {
        DoctorEntity entity = new DoctorEntity();
        BeanUtils.copyProperties(dto, entity);

        entity.setCreatedBy("system");
        entity.setCreatedOn(LocalDateTime.now());
        return doctorRepo.save(entity);
    }
}
