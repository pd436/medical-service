package com.medical.service.impl;


import com.medical.model.Consultation;
import com.medical.repository.ConsultationRepository;
import com.medical.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultationServiceImpl implements ConsultationService {


    @Autowired
    ConsultationRepository consultationRepository;

    @Override
    public Consultation addPatientConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    @Override
    public void removePatientConsultation(int consultationId) {
        consultationRepository.deleteById((long) consultationId);
    }


}
