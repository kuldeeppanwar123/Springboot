package com.springboot.learn.Day_04_01_many_to_many_doctor_patient_appointment.repository;

import com.springboot.learn.Day_04_01_many_to_many_doctor_patient_appointment.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
