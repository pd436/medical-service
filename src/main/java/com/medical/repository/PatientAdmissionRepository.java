package com.medical.repository;
import com.medical.response.ClinicRooms;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.medical.model.PatientAdmissions;

public interface PatientAdmissionRepository  extends JpaRepository<PatientAdmissions,Long> {

	@Query ("Select new com.medical.response.ClinicRooms(n.unitNumber, n.wing, n.bed, p.patientId, n.nursingUnitId) from  PatientAdmissions p , NursingUnit n "
			+ "	where p.nursingUnitId = n.nursingUnitId and p.patientId is not null")
	public List<ClinicRooms> getOccupiedRooms();
	
	
	@Query ("Select new com.medical.response.ClinicRooms(n.unitNumber, n.wing, n.bed, n.nursingUnitId) from  NursingUnit n "
			+ "	where n.nursingUnitId not in (Select p.nursingUnitId from  PatientAdmissions p )")
	public List<ClinicRooms> getAvailableRooms();
	
	@Query("Select p from PatientAdmissions p where p.nursingUnitId = :nursingUnitId")
	public PatientAdmissions getAdmissionDetailsById(@Param("nursingUnitId") Integer nursingUnitId);
	
	@Modifying
	@Query("Delete from PatientAdmissions p where p.patientId = :patientId and p.nursingUnitId = :nursingUnitId  ")
	void deleteByRoomIdAndPatientId(@Param("patientId") Integer patientId, @Param("nursingUnitId") Integer nursingUnitId);
	
	
	
	@Query ("Select new com.medical.response.ClinicRooms(n.unitNumber, n.wing, n.bed, p.patientId, n.nursingUnitId) from  PatientAdmissions p , NursingUnit n "
			+ "	where p.nursingUnitId = n.nursingUnitId and p.patientId= :patientId")
	public List<ClinicRooms> getRoomsByPatientId(@Param("patientId") Integer patientId);
		
	
}
