package com.medical.service.impl;

import com.medical.model.Patient;
import com.medical.repository.ClinicPatientRepository;
import com.medical.service.ClinicPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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
}
