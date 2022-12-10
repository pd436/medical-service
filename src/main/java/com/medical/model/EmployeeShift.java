package com.medical.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="employee_shift", schema= "DMSD_MEDICAL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@IdClass(EmployeeShiftID.class)
public class EmployeeShift  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "shift_id")
    private Long shiftId;

    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "shift_type_id")
    private int shiftTypeId;

    @Column(name = "shift_date")
    @JsonFormat(pattern="MM/dd/yyyy")
    private Date shiftDate;

}
