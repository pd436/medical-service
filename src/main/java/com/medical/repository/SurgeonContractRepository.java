package com.medical.repository;

import com.medical.model.SurgeonContract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurgeonContractRepository extends JpaRepository<SurgeonContract,Long> {
}
