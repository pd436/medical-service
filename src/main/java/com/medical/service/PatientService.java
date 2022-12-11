package com.medical.service;

import com.medical.util.Constants.AllotmentType;

public interface PatientService {

	public void updateSurgeonForPatient(Integer patientId,Integer clinicEmployeeId, AllotmentType type);
	
	public void updateNurseForPatient(Integer patientId,Integer clinicEmployeeId, AllotmentType type);
	
}
