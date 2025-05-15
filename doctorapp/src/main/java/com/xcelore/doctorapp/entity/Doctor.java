package com.xcelore.doctorapp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Doctor {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Size(min = 3)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Pattern(regexp = "Delhi|Noida|Faridabad", message = "City must be Delhi, Noida or Faridabad")
    private String city;

    @Email
    private String email;

    @Size(min = 10)
    private String phone;

    @Pattern(regexp = "Orthopaedic|Gynecology|Dermatology|ENT", message = "Invalid speciality")
    private String speciality;

    // Getters and Setters
}