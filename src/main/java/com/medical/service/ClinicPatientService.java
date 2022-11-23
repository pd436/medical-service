package com.medical.service;

import com.medical.model.Patient;

import java.util.List;
import java.util.Optional;


public interface ClinicPatientService {
    public Patient addPatient(Patient patient);

    public List<Patient> getAllPatients();

    public Optional<Patient> getPatientById(Long id);
}
