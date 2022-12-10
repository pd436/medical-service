package com.medical.service;

import com.medical.model.Illness;
import java.util.List;
import java.util.Optional;

public interface IllnessService {

    public List<Illness> getIllnessByIds(List<Illness> illnesses);

    public List<Illness> getAllIllnesses();


    public Optional<Illness> getIllnessById(Long id);
}
