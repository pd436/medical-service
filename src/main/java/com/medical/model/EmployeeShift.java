package com.medical.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="employee_shift", schema= "DMSD_MEDICAL")
//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(EmployeeShiftID.class)
public class EmployeeShift  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "shift_id")
    private Long shiftId;

    @Id
    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "clinic_employee_id")
//    @JsonIgnore
    @JsonBackReference
    private ClinicEmployee clinicEmployee;

    @Id
    @ManyToOne
    @JoinColumn(name = "shift_type_id", referencedColumnName = "shift_id")
    private EmployeeShiftType shiftType;

    @Column(name = "shift_date")
    @JsonFormat(pattern="MM/dd/yyyy")
    private Date shiftDate;

}
