package com.springboot.learn.Day_04_01_many_to_many_doctor_patient_appointment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Doctor extends BaseModel {

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "phone", nullable = false, unique = true)
    private String phone;

    @Column(name = "email", nullable = true, unique = true)
    private String email;

    @Column(name = "gender", nullable = true)
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Column(name = "specialization", nullable = false, unique = false)
    private String specialization;

    @Column(name = "experience")
    private Integer experience;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Appointment>appointments = new ArrayList<>();
}
