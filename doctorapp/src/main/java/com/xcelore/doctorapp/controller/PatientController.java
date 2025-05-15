package com.xcelore.doctorapp.controller;

import com.xcelore.doctorapp.entity.Patient;
import com.xcelore.doctorapp.repository.PatientRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepo;

    @PostMapping
    public Patient addPatient(@Valid @RequestBody Patient patient) {
        return patientRepo.save(patient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePatient(@PathVariable Long id) {
        patientRepo.deleteById(id);
        return ResponseEntity.ok("Patient deleted");
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientRepo.findAll();
    }
}