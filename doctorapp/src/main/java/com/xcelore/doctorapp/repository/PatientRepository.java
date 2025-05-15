package com.xcelore.doctorapp.repository;

import com.xcelore.doctorapp.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}