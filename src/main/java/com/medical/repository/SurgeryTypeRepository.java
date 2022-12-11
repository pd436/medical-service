package com.medical.repository;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.medical.model.SurgeryType;

public interface SurgeryTypeRepository extends JpaRepository<SurgeryType, Long> {

	@Query(value = "select t.surgery_type_id surgeryTypeId, t.special_needs specialNeeds, "
			+ "a.location location, c.description description, "
			+ "s.surgery_skill_id surgerySkillId, s.skill_description skillDescription "
			+ "from DMSD_MEDICAL.surgery_type t, " + "DMSD_MEDICAL.surgery_skill s,  "
			+ "DMSD_MEDICAL.surgery_type_skill ts, " + "DMSD_MEDICAL.anatomical_location a, "
			+ "DMSD_MEDICAL.surgery_category c " + "where t.anatomical_location_id = a.location_id  "
			+ "and t.surgery_category_id = c.surgery_category_id  " + "and t.surgery_type_id = ts.surgery_type_id "
			+ "and s.surgery_skill_id = ts.surgery_skill_id ", nativeQuery = true)
	List<Tuple> getSurrgetTypesForClinic();

}
