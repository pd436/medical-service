package com.medical.service;

import com.medical.dto.ClinicPatientDTO;
import com.medical.dto.ConsultationDTO;
import com.medical.model.Patient;

import java.util.List;


public interface ClinicPatientService {
    public Patient addPatient(Patient patient);

    public List<Patient> getAllPatients();

    public ClinicPatientDTO getPatientById(Long id);

    public int saveIllnessForPatient(int patientId, int illnessId);

    public int deleteIllnessForPatient(int patientId, int illnessId);

    Integer saveAllergyForPatient(int patientId, int allergyId);

    public int deleteAllergyForPatient(int patientId, int allergyId);

    public List<ConsultationDTO> getPatientConsultations(int patientId);


}
