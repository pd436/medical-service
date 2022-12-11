package com.medical.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="patient_illness", schema= "DMSD_MEDICAL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientIllness {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "patient_illness_id")
    private Long patientIllnessId;


    @Column(name = "illness_id")
    private Long illnessId;

    @Column(name = "patient_id")
    private Long patientId;



}
