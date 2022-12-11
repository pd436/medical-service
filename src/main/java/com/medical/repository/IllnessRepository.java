package com.medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.model.Illness;

public interface IllnessRepository  extends JpaRepository<Illness,Long> {
}