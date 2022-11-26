package com.medical.service.impl;


import com.medical.model.SurgeonContract;
import com.medical.repository.SurgeonContractRepository;
import com.medical.service.SurgeonContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurgeonContractImpl implements SurgeonContractService {

    @Autowired
    SurgeonContractRepository surgeonContractRepository;

    @Override
    public List<SurgeonContract> getAllSurgeonContracts() {
        return surgeonContractRepository.findAll();
    }
}
