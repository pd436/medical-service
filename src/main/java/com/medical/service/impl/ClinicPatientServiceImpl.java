package com.medical.service.impl;

import com.medical.dto.ClinicPatientAllergyDTO;
import com.medical.dto.ClinicPatientDTO;
import com.medical.dto.ClinicPatientIllnessDTO;
import com.medical.mapstruct.mappers.IMedicalMapper;
import com.medical.model.Patient;
import com.medical.repository.ClinicPatientRepository;
import com.medical.service.ClinicPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClinicPatientServiceImpl implements ClinicPatientService {

    @Autowired
    ClinicPatientRepository patientRepository;

    @Override
    public Patient addPatient(Patient patient) {

        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }


    @Override
    public ClinicPatientDTO getPatientById(Long id) {

        Patient patient = patientRepository.findById(id).get();

        ClinicPatientDTO clinicPatientDTO = IMedicalMapper.MAPPER.clinicPatientToClinicPatientDto(patient);

        clinicPatientDTO.setIllness(patientRepository.getPatientIllnessByEmplId(id));

        clinicPatientDTO.setAllergy(patientRepository.getPatientAllergyByEmplId(id));

        return clinicPatientDTO;
    }

    @Override
    public int saveIllnessForPatient(int patientId, int illnessId) {
       return patientRepository.savePatientIllness(patientId,illnessId);
    }

    @Override
    public int deletellnessForPatient(int patientId, int illnessId) {
        return patientRepository.deletePatientIllness(patientId,illnessId);
    }

    @Override
    public Integer saveAllergyForPatient(int patientId, int allergyId) {
        return patientRepository.savePatientAllergy(patientId,allergyId);
    }

    @Override
    public int deleteAllergyForPatient(int patientId, int allergyId) {
        return patientRepository.deletePAtientAllergy(patientId,allergyId);
    }





}
