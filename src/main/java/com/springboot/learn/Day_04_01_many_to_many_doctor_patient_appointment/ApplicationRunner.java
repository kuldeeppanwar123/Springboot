package com.springboot.learn.Day_04_01_many_to_many_doctor_patient_appointment;

import com.springboot.learn.Day_04_01_many_to_many_doctor_patient_appointment.entity.*;
import com.springboot.learn.Day_04_01_many_to_many_doctor_patient_appointment.repository.AppointmentRepository;
import com.springboot.learn.Day_04_01_many_to_many_doctor_patient_appointment.repository.DoctorRepository;
import com.springboot.learn.Day_04_01_many_to_many_doctor_patient_appointment.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private PatientRepository patientRepository;
    public void run(String ...args) {
        System.out.println("Application runner...");

        Doctor doctor = new Doctor();
        doctor.setFirstName("Kuldeep");
        doctor.setLastName("Panwar");
        doctor.setGender(Gender.MALE);
        doctor.setPhone("9999999999");
        doctor.setEmail("kuldeep@gmail.com");
        doctor.setExperience(10);
        doctor.setSpecialization("cardiologist");

        Patient patient = new Patient();
        patient.setFirstName("raja");
        patient.setLastName("goyal");
        patient.setGender(Gender.MALE);
        patient.setBloodGroup(BloodGroup.AB_POS);
        patient.setEmail("raja@gmail..com");
        patient.setPhone("6666666666");

        doctorRepository.save(doctor);
        patientRepository.save(patient);

        Appointment appointment = new Appointment();
        appointment.setAppointmentDate(new Date());
        appointment.setDoctor(doctor);
        appointment.setPatient(patient);
        appointment.setReason("fever");

        appointmentRepository.save(appointment);
    }
}
