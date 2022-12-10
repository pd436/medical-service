package com.medical.repository;


import com.medical.dto.ClinicPatientAllergyDTO;
import com.medical.dto.ClinicPatientIllnessDTO;
import com.medical.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ClinicPatientRepository  extends JpaRepository<Patient,Long> {



    @Query("select new com.medical.dto.ClinicPatientIllnessDTO(i.illnessId,i.code, i.desc,i.reqHospitalization) " +
            "from Illness i " +
            "join PatientIllness pi on pi.illnessId = i.illnessId " +
            "where pi.patientId = :patientId"
    )
    List<ClinicPatientIllnessDTO> getPatientIllnessByEmplId(@Param("patientId")Long patientId);

    @Query("select new com.medical.dto.ClinicPatientAllergyDTO(a.allergyId,a.code, a.name) " +
            "from Allergy a " +
            "join PatientAllergy pa on pa.allergyId = a.allergyId " +
            "where pa.patientId = :patientId"
    )
    List<ClinicPatientAllergyDTO> getPatientAllergyByEmplId(@Param("patientId")Long patientId);



    @Modifying
    @Query(value="insert into patient_illness(patient_Id,illness_Id) values(:patient_Id,:illness_Id)",nativeQuery = true)
    @Transactional
    int  savePatientIllness(@Param("patient_Id")int patientId,@Param("illness_Id")int illnessId);


    @Modifying
    @Query(value="delete from  patient_illness where patient_id= :patient_Id and illness_id= :illness_Id",nativeQuery = true)
    @Transactional
    int  deletePatientIllness(@Param("patient_Id")int patientId,@Param("illness_Id")int illnessId);

    @Modifying
    @Query(value="insert into patient_allergy(patient_Id,allergy_Id) values(:patient_Id,:allergy_Id)",nativeQuery = true)
    @Transactional
    Integer savePatientAllergy(@Param("patient_Id")int patientId,@Param("allergy_Id")int allergyId);

    @Modifying
    @Query(value="delete from  patient_allergy where patient_id= :patient_Id and allergy_id= :allergy_Id",nativeQuery = true)
    @Transactional
    int deletePAtientAllergy(@Param("patient_Id")int patientId,@Param("allergy_Id")int allergyId);

}
