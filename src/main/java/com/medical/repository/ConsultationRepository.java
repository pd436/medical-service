package com.medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.medical.model.Consultation;

public interface ConsultationRepository  extends JpaRepository<Consultation,Long> {
	
	
	@Query("Select c from Consultation c where c.patientId = :patientId")
	public Consultation getConsultationDetailsByPatientId(@Param("patientId") Integer patientId);
	
	
	@Modifying
	@Query("Delete from Consultation c where c.physicianId = :physicianId and c.patientId = :patientId ")
	void deleteByPhysicianIdAndPatientId(@Param("physicianId") Integer physicianId , @Param("patientId") Integer patientId);
	

}
