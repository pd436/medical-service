package com.medical.repository;


import com.medical.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicPatientRepository  extends JpaRepository<Patient,Long> {
}
