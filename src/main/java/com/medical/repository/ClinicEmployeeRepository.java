package com.medical.repository;
import com.medical.model.EmployeeShiftType;
import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.model.ClinicEmployee;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClinicEmployeeRepository  extends JpaRepository<ClinicEmployee,Long> {
}
