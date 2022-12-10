package com.medical.service;

import com.medical.dto.ClinicPatientDTO;
import com.medical.model.Patient;

import java.util.List;
import java.util.Optional;


public interface ClinicPatientService {
    public Patient addPatient(Patient patient);

    public List<Patient> getAllPatients();

    public ClinicPatientDTO getPatientById(Long id);

    public int saveIllnessForPatient(int patientId, int illnessId);

    public int deletellnessForPatient(int patientId, int illnessId);

    Integer saveAllergyForPatient(int patientId, int allergyId);

    public int deleteAllergyForPatient(int patientId, int allergyId);
}
