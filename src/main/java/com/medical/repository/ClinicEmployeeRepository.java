package com.medical.repository;
import com.medical.dto.ClinicEmployeeShiftDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import com.medical.model.ClinicEmployee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClinicEmployeeRepository  extends JpaRepository<ClinicEmployee,Long> {


//    @Query(value="select ce.clinic_employee_id as clinicEmployeeId  from clinic_employee ce "+
//            "join employee_shift es on es.employee_id = ce.clinic_employee_id "+
//            "join shift_type st on es.shift_type_id  = st.shift_id "+
//            "where ce.clinic_employee_id =153",nativeQuery = true)

    @Query("select distinct new com.medical.dto.ClinicEmployeeShiftDTO(ce.clinicId,ce.clinicEmployeeId,ce.firstName,ce.lastName,ce.gender, " +
            "ce.address, ce.phoneNumber, ce.salary, ce.ssn, ce.dob, ce.yearsExperience, ce.isOwner, ce.isActive, ce.shiftId, " +
            "ce.maxAllocatedPatient, ce.minAllocatedPatient, " +
            "ce.employeeNumber, es.shiftTypeId,es.shiftDate, est.shiftDesc,est.shiftType) from ClinicEmployee ce " +
            "join EmployeeShift es on es.employeeId = ce.clinicEmployeeId " +
            "join EmployeeShiftType est on est.shiftId = es.shiftTypeId " +
            "where ce.clinicEmployeeId = :employeeId"
    )
    List<ClinicEmployeeShiftDTO> getEmployeeAndShiftsById(@Param("employeeId")Long employeeId);


    @Query("select distinct new com.medical.dto.ClinicEmployeeShiftDTO(ce.clinicId,ce.clinicEmployeeId,ce.firstName,ce.lastName,ce.gender, " +
            "ce.address, ce.phoneNumber, ce.salary, ce.ssn, ce.dob, ce.yearsExperience, ce.isOwner, ce.isActive, " +
            "ce.maxAllocatedPatient, ce.minAllocatedPatient, " +
            "ce.employeeNumber) from ClinicEmployee ce " +
            "where ce.clinicEmployeeId = :employeeId"
    )
    ClinicEmployeeShiftDTO getEmployeeById(@Param("employeeId")Long employeeId);
}
