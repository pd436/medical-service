package com.medical.service.impl;

import com.medical.model.NurseGrade;
import com.medical.repository.NurseGradeRepository;
import com.medical.service.NurseGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NurseGradeServiceImpl implements NurseGradeService {
    @Autowired
    NurseGradeRepository nurseGradeRepository;

    @Override
    public List<NurseGrade> getAllNurseGrades() {
        return nurseGradeRepository.findAll();
    }
}
