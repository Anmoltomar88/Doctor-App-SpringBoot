package com.xcelore.doctorapp.controller;

import com.xcelore.doctorapp.entity.Doctor;
import com.xcelore.doctorapp.service.DoctorSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suggest")
public class SuggestionController {

    @Autowired
    private DoctorSuggestionService suggestionService;

    @GetMapping("/{patientId}")
    public ResponseEntity<?> suggestDoctor(@PathVariable Long patientId) {
        try {
            List<Doctor> doctors = suggestionService.suggestDoctors(patientId);
            return ResponseEntity.ok(doctors);
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }
}