package com.xworkz.hospital.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

@Setter
@Getter
@ToString
@Entity
public class ReceptionistEntity {

    private int id;
    private String name;
    private long phoneNumber;
    private String email;
    private String qualification;
    private String department;
    private String gender;
    private String password;
    private boolean isActive;
}
