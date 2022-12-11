package com.medical.repository;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.medical.model.SurgerySchedule;

public interface SurgeryScheduleRepository extends JpaRepository<SurgerySchedule,Long> {
	
	@Query("Select s from SurgerySchedule s")
	List<SurgerySchedule>  getSurgeries();
	
	@Query(value = "select c.clinic_employee_id, c.employee_number,c.speciality , c.name ,c.phone_number "
			+ "from DMSD_MEDICAL.surgery_schedule s, "
			+ "DMSD_MEDICAL.clinic_employee c "
			+ "where c.clinic_employee_id = s.physician_id "
			+ "group by clinic_employee_id", nativeQuery = true)
	List<Tuple> getSurgeryListSurgeonsOverView();
	
	
	
	@Query(value = "select s.patient_id, p.name, p.telephone from DMSD_MEDICAL.surgery_schedule s, "
			+ "DMSD_MEDICAL.patient p "
			+ "where p.patient_id = s.patient_id "
			+ "group by patient_id", nativeQuery = true)
	List<Tuple> getSurgeryListPatientOverView();
	
	
	
	@Query(value = "select p.name ,s.surgery_date,t.special_needs ,c.description category , a.location , n.unit_number_id, "
			+ "n.wing,n.bed from DMSD_MEDICAL.surgery_schedule s, DMSD_MEDICAL.patient p , "
			+ "DMSD_MEDICAL.surgery_type t, DMSD_MEDICAL.surgery_category c, "
			+ "DMSD_MEDICAL.anatomical_location a, "
			+ "DMSD_MEDICAL.patient_admissions pa , "
			+ "DMSD_MEDICAL.nursing_unit n   "
			+ "where p.patient_id = s.patient_id  "
			+ "and c.surgery_category_id = t.surgery_category_id "
			+ "and t.surgery_type_id = s.surgery_type_id "
			+ "and t.anatomical_location_id = a.location_id  "
			+ "and pa.patient_id = s.patient_id "
			+ "and n.nursing_unit_id = pa.nursing_unit_id "
			+ "and s.physician_id = :clinicEmployeeId", nativeQuery = true)
	List<Tuple> getSurgeryListBySurgeonId(@Param("clinicEmployeeId") Integer clinicEmployeeId);
	
	
	
	@Query(value = "select e.name , e.phone_number, e.years_experience ,s.surgery_date, "
			+ "t.special_needs ,c.description category , a.location , n.unit_number_id, "
			+ "n.wing,n.bed from DMSD_MEDICAL.surgery_schedule s, DMSD_MEDICAL.patient p , "
			+ "DMSD_MEDICAL.surgery_type t, DMSD_MEDICAL.surgery_category c,\n"
			+ "DMSD_MEDICAL.clinic_employee e, "
			+ "DMSD_MEDICAL.anatomical_location a, "
			+ "DMSD_MEDICAL.patient_admissions pa , "
			+ "DMSD_MEDICAL.nursing_unit n   "
			+ "where p.patient_id = s.patient_id  "
			+ "and e.clinic_employee_id = s.physician_id "
			+ "and c.surgery_category_id = t.surgery_category_id "
			+ "and t.surgery_type_id = s.surgery_type_id "
			+ "and t.anatomical_location_id = a.location_id "
			+ "and pa.patient_id = s.patient_id\n"
			+ "and n.nursing_unit_id = pa.nursing_unit_id "
			+ "and s.patient_id = :patientId", nativeQuery = true)
	List<Tuple> getSurgeryListByPatientId(@Param("patientId") Integer patientId);
	

	
}
