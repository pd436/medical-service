package com.medical.repository;

import com.medical.model.EmployeeShift;
import com.medical.model.EmployeeShiftType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface ClinicEmployeeShiftRepository extends JpaRepository<EmployeeShift,Long> {

    @Modifying
    @Query(value = "insert into employee_shift (employee_id,shift_type_id,shift_date) select :emplId,:shiftTypeId,:shiftDate",nativeQuery = true)
    @Transactional
    int saveEmployeeShift(@Param("emplId")Integer emplId, @Param("shiftTypeId") Integer shiftTypeId, @Param("shiftDate") Date shiftDate);

    @Query(value="select  es.shift_id, es.employee_id, es.shift_type_id, es.shift_date from employee_shift es where es.employee_id = ?1 ",nativeQuery = true)
    List<EmployeeShift> getEmployeeShift(Long employeeId);
}
