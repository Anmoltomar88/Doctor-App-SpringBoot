package com.xcelore.doctorapp.util;

import java.util.Map;
import java.util.Optional;

public class SymptomMapper {
    private static final Map<String, String> map = Map.ofEntries(
        Map.entry("Arthritis", "Orthopaedic"),
        Map.entry("Back Pain", "Orthopaedic"),
        Map.entry("Tissue injuries", "Orthopaedic"),
        Map.entry("Dysmenorrhea", "Gynecology"),
        Map.entry("Skin infection", "Dermatology"),
        Map.entry("skin burn", "Dermatology"),
        Map.entry("Ear pain", "ENT")
    );

    public static Optional<String> getSpeciality(String symptom) {
        return Optional.ofNullable(map.get(symptom));
    }
}