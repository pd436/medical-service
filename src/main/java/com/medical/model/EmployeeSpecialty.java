package com.medical.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="employee_specialty", schema= "DMSD_MEDICAL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeSpecialty {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="specialty_id")
    private Integer specialityId;

    @Column(name="specialty")
    private String specialty;

    @OneToOne(mappedBy = "specialty")
    @JsonIgnore
    private ClinicEmployee clinicEmployee;
}
