package com.medical.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="contract", schema= "DMSD_MEDICAL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SurgeonContract {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="contract_type_id")
    private Integer contractTypeId;

    @Column(name="contract_type")
    private String contractType;

    @Column(name="contract_length")
    private Integer contractLength;

    @OneToOne(mappedBy = "contract")
    @JsonIgnore
    private ClinicEmployee clinicEmployee;


}
