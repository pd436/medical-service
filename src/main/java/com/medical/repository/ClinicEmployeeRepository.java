package com.medical.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.model.ClinicEmployee;

public interface ClinicEmployeeRepository  extends JpaRepository<ClinicEmployee,Long> {

}
