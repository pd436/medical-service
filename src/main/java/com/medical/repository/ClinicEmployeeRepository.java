package com.medical.repository;

import com.medical.dto.ClinicEmployeeDTO;
import com.medical.model.ClinicEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClinicEmployeeRepository  extends JpaRepository<ClinicEmployee,Long> {



    @Query("select distinct new com.medical.dto.ClinicEmployeeDTO(ce.clinicId,ce.clinicEmployeeId,ce.firstName,ce.lastName,ce.gender, " +
            "ce.address, ce.phoneNumber, ce.salary, ce.ssn, ce.dob, ce.yearsExperience, ce.isOwner, ce.isActive, " +
            "ce.maxAllocatedPatient, ce.minAllocatedPatient, " +
            "ce.employeeNumber, es.shiftTypeId,es.shiftDate, est.shiftDesc,est.shiftType) from ClinicEmployee ce " +
            "join EmployeeShift es on es.employeeId = ce.clinicEmployeeId " +
            "join EmployeeShiftType est on est.shiftId = es.shiftTypeId " +
            "where ce.clinicEmployeeId = :employeeId"
    )
    List<ClinicEmployeeDTO> getEmployeeAndShiftsById(@Param("employeeId")Long employeeId);


    @Query("select distinct new com.medical.dto.ClinicEmployeeDTO(ce.clinicId,ce.clinicEmployeeId,ce.firstName,ce.lastName,ce.gender, " +
            "ce.address, ce.phoneNumber, ce.salary, ce.ssn, ce.dob, ce.yearsExperience, ce.isOwner, ce.isActive, " +
            "ce.maxAllocatedPatient, ce.minAllocatedPatient, " +
            "ce.employeeNumber) from ClinicEmployee ce " +
            "where ce.clinicEmployeeId = :employeeId"
    )
    ClinicEmployeeDTO getEmployeeById(@Param("employeeId")Long employeeId);


    @Query("select new com.medical.dto.ClinicEmployeeDTO(ce.firstName,ce.lastName,ce.occupation.occupationId,ce.clinicEmployeeId) " +
            "from ClinicEmployee ce where ce.occupation.occupationId = :occupationId")
    List<ClinicEmployeeDTO> getEmployeeDetailsByOccupation(@Param("occupationId")int occupationId);

}
