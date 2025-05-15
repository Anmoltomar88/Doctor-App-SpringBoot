package com.xcelore.doctorapp.service;

import com.xcelore.doctorapp.entity.Doctor;
import com.xcelore.doctorapp.entity.Patient;
import com.xcelore.doctorapp.repository.DoctorRepository;
import com.xcelore.doctorapp.repository.PatientRepository;
import com.xcelore.doctorapp.util.SymptomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorSuggestionService {

    @Autowired
    private PatientRepository patientRepo;

    @Autowired
    private DoctorRepository doctorRepo;

    public List<Doctor> suggestDoctors(Long patientId) {
        Patient patient = patientRepo.findById(patientId)
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        Optional<String> specialityOpt = SymptomMapper.getSpeciality(patient.getSymptom());
        if (specialityOpt.isEmpty()) {
            throw new RuntimeException("Symptom not recognized");
        }

        String city = patient.getCity();
        if (!List.of("Delhi", "Noida", "Faridabad").contains(city)) {
            throw new RuntimeException("We are still waiting to expand to your location");
        }

        List<Doctor> doctors = doctorRepo.findByCityAndSpeciality(city, specialityOpt.get());
        if (doctors.isEmpty()) {
            throw new RuntimeException("There isn’t any doctor present at your location for your symptom");
        }

        return doctors;
    }
}