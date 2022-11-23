package com.medical.service;

import com.medical.model.Patient;

import java.text.ParseException;
import java.util.List;


public interface ClinicPatientService {
    public Patient addPatient(Patient patient);

    public List<Patient> getAllPatients();
}
