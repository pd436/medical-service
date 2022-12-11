package com.medical.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.medical.model.Consultation;
import com.medical.model.PatientNurse;
import com.medical.model.PatientNursePk;
import com.medical.repository.ConsultationRepository;
import com.medical.repository.PatientNurseRepository;
import com.medical.service.PatientService;
import com.medical.util.Constants.AllotmentType;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	ConsultationRepository consulationRepository;
	
	@Autowired
	PatientNurseRepository nurseRepository;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateSurgeonForPatient(Integer patientId, Integer clinicEmployeeId, AllotmentType type) {
		try {
			if (StringUtils.isNoneBlank(type.toString())) {

				switch (type) {
				case assign:
					
					Consultation consultationDetails = consulationRepository.getConsultationDetailsByPatientId(patientId);
					
					if(consultationDetails!=null  &&
							Integer.compare(clinicEmployeeId, consultationDetails.getPhysicianId())!=0) {
						throw new Exception("There is already a Doctor assigned for this Patient");
					}
					
					var pd = Consultation.builder().patientId(patientId)
							.physicianId(clinicEmployeeId)
							.build();
					consulationRepository.save(pd);
					break;
				case remove:
					consulationRepository.deleteByPhysicianIdAndPatientId(clinicEmployeeId, patientId);
					break;
				default:
					log.error("Invalid Nursing Unit Type, sending an  empty response");
				}
			}
		} catch (Exception e) {
			log.error("Exception while updating Clinic Room for a patient: " + patientId + " " + e);
		}

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateNurseForPatient(Integer patientId, Integer clinicEmployeeId, AllotmentType type) {
		try {
			if (StringUtils.isNoneBlank(type.toString())) {

				switch (type) {
				case assign:
				
					if(nurseRepository.getNurseCount(clinicEmployeeId)>5) {
						throw new Exception("Maximum Patients alloted to the Nurse");
					}
					PatientNursePk id = PatientNursePk.builder()
							.nurseId(clinicEmployeeId)
							.patientId(patientId)
							.build();
					var  n= PatientNurse.builder().id(id).build(); 
					nurseRepository.save(n);
					break;
				case remove:
					nurseRepository.deleteByNurseIdAndPatientId(clinicEmployeeId, patientId);
					break;
				default:
					log.error("Invalid Nursing Unit Type, sending an  empty response");
				}
			}
		} catch (Exception e) {
			log.error("Exception while updating Clinic Room for a patient: " + patientId + " " + e);
		}

	}

}
