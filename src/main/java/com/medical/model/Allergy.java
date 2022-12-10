package com.medical.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="allergy", schema= "DMSD_MEDICAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Allergy implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "allergy_id")
    private Long allergyId;

    @Column(name="code")
    private Integer code;

    @Column(name="name")
    private String name;

//    @OneToMany(mappedBy = "allergy")
//    @JsonIgnore
//    private Set<PatientAllergy> patientAllergy = new HashSet<>();


}
