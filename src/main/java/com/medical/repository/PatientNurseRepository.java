package com.medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.medical.model.PatientNurse;
import com.medical.model.PatientNursePk;

public interface PatientNurseRepository extends JpaRepository<PatientNurse,PatientNursePk> {

	
	@Query("Select count(pn.id.nurseId) from PatientNurse pn where pn.id.nurseId = :nurseId")
	int getNurseCount(@Param("nurseId") Integer nurseId);
	
	
	@Modifying
	@Query("Delete from PatientNurse pn where pn.id.nurseId = :nurseId and pn.id.patientId = :patientId ")
	void deleteByNurseIdAndPatientId(@Param("nurseId") Integer nurseId , @Param("patientId") Integer patientId);


}
