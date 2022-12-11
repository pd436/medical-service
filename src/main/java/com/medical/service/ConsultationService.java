package com.medical.service;

import com.medical.model.Consultation;

public interface ConsultationService {

    public Consultation addPatientConsultation(Consultation consultation);

    public void removePatientConsultation(int consultationId);
}
