package com.medical.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
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

    @ManyToOne()
    @JoinColumn(name="patient_id", nullable=false)
    @JsonIgnore
    private Patient patient;

    @ManyToOne
    @JoinColumn(name="allergy_id", nullable=false)
    @JsonIgnore
    private Allergy allergy;

}