package com.springboot.learn.Day_04_01_many_to_many_doctor_patient_appointment.repository;

import com.springboot.learn.Day_04_01_many_to_many_doctor_patient_appointment.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
