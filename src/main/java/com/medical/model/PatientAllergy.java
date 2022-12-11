package com.medical.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="patient_allergy", schema= "DMSD_MEDICAL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientAllergy {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "patient_allergy_id")
    private Long patientAllergyId;


    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "allergy_id")
    private Long allergyId;



}