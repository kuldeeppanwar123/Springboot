package com.springboot.learn.Day_04_01_many_to_many_doctor_patient_appointment.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;

    @CreatedDate
    @Column(name = "createdAt", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createdAt;

    @LastModifiedDate
    @Column(name = "updatedAt", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date updatedAt;
}
