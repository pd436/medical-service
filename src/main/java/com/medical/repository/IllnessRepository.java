package com.medical.repository;

import com.medical.model.Illness;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IllnessRepository  extends JpaRepository<Illness,Long> {
}