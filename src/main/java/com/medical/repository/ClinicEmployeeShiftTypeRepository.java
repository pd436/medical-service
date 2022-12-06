package com.medical.repository;


import com.medical.model.EmployeeShiftType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClinicEmployeeShiftTypeRepository extends JpaRepository<EmployeeShiftType,Long> {

    @Query(value="select st.shift_id,st.shift_type, st.shift_desc from shift_type st ",nativeQuery = true)
    List<EmployeeShiftType> findAllShiftTypes();
}
