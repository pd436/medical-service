package com.medical.service;

import com.medical.model.Allergy;
import com.medical.model.Illness;

import java.util.List;
import java.util.Optional;




public interface AllergyService {

    public List<Allergy> getAllergyByIds(List<Allergy> illnesses);

    public List<Allergy> getAllAllergies();

    public Optional<Allergy> getAllergyById(Long id);
}
