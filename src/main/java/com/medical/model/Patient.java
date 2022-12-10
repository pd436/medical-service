package com.medical.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="patient", schema= "DMSD_MEDICAL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "patient_id")
    private Long patientId;

    @Column(name="first_name")
    private String  firstName;

    @Column(name="last_name")
    private String  lastName;

    @Column(name="gender")
    private String  gender;

    @Column(name="address")
    private String  address;

    @Column(name="ssn")
    private String  ssn;

    @Column(name="telephone")
    private String  telephone;

    @Column(name="dob")
    @JsonFormat(pattern="MM/dd/yyyy")
    private Date dob;

//    @OneToMany(mappedBy = "patient")
//    private Set<PatientIllness> illness = new HashSet<>();
//
//    @OneToMany(mappedBy = "patient")
//    private Set<PatientAllergy> allergy = new HashSet<>();


}
