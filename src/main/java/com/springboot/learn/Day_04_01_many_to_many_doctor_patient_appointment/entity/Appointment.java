package com.springboot.learn.Day_04_01_many_to_many_doctor_patient_appointment.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Appointment extends BaseModel {
    private Date appointmentDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private AppointmentStatus status = AppointmentStatus.SCHEDULED;

    @Column(name = "reason")
    private String reason;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
