package com.medical.service.impl;

import com.medical.model.Illness;
import com.medical.repository.IllnessRepository;
import com.medical.service.IllnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class IllnessServiceImpl implements IllnessService {

    @Autowired
    IllnessRepository illnessRepository;

    @Override
    public List<Illness> getIllnessByIds(List<Illness> illnesses){
        List<Illness> foundIllnesses = new ArrayList<>();

        illnesses.forEach(illness->{
            Optional<Illness> illnessFound = this.getIllnessById(illness.getIllnessId());
            foundIllnesses.add(illnessFound.get());
        });

        return foundIllnesses;
    };

    @Override
    public Optional<Illness> getIllnessById(Long id){
        return illnessRepository.findById(id);
    }
}
