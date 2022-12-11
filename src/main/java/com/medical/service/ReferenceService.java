package com.medical.service;

import java.util.List;

import com.medical.model.NursingUnit;
import com.medical.response.SurgeryTypes;

public interface ReferenceService {
	
	public List<NursingUnit> getNursingUnits();

	public List<SurgeryTypes> getSurgeryTypes();

}
