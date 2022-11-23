package com.medical.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="patient_illness", schema= "DMSD_MEDICAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientIllness {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "patient_illness_id")
    private Integer patientIllnessId;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name="patient_id", nullable=false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name="illness_id", nullable=false)
    @JsonIgnore
    private Illness illness;

}
