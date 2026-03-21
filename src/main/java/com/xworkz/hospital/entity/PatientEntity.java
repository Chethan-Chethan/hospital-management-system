package com.xworkz.hospital.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@Entity
public class PatientEntity {

    private int id;
    private String name;
    private long phoneNumber;
    private String email;
    private String gender;
    private LocalDate dob;
    private String bloodType;
    private String address;
    private String otp;
    private boolean isActive;
}
