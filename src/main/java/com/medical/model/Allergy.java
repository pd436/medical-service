package com.medical.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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
