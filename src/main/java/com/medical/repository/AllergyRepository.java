package com.medical.repository;

import com.medical.model.Allergy;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AllergyRepository  extends JpaRepository<Allergy,Long> {
}
