package com.medical.repository;

import com.medical.model.NurseGrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseGradeRepository extends JpaRepository<NurseGrade,Long> {
}
