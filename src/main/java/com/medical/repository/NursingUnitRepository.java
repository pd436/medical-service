package com.medical.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.medical.model.NursingUnit;
import com.medical.response.ClinicRooms;

public interface NursingUnitRepository  extends JpaRepository<NursingUnit,Long> {
	
	@Query ("Select new com.medical.response.ClinicRooms(n.unitNumber, n.wing, n.bed, n.nursingUnitId) from  NursingUnit n ")
	public List<ClinicRooms> getAllRooms();

	
}
