package com.medical.service.impl;

import com.medical.model.Allergy;
import com.medical.model.Illness;
import com.medical.repository.AllergyRepository;
import com.medical.repository.IllnessRepository;
import com.medical.service.AllergyService;
import com.medical.service.IllnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;




@Service
public class AllergyServiceImpl implements AllergyService {

    @Autowired
    AllergyRepository allergyRepository;

    @Override
    public List<Allergy> getAllergyByIds(List<Allergy> allergies){
        List<Allergy> foundAllergies = new ArrayList<>();

        allergies.forEach(allergy->{
            Optional<Allergy> allergyFound = this.getAllergyById(allergy.getAllergyId());
            foundAllergies.add(allergyFound.get());
        });

        return foundAllergies;
    }

    @Override
    public List<Allergy> getAllAllergies() {
        return allergyRepository.findAll();
    }

    @Override
    public Optional<Allergy> getAllergyById(Long id){
        return allergyRepository.findById(id);
    }
}
