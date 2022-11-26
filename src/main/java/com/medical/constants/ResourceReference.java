package com.medical.constants;

public interface ResourceReference {

	static final String CLINIC_EMLPLOYEE_DETAILS = "/clinic-employee";
	
	static final String OCCUPATION = "/occupation";

	static final String PATIENT = "/patient";
	static final String PATIENT_BY_ID = PATIENT + "/{patient_id}";

	static final String ALLERGY = "/allergy";

	static final String ALLERGY_BY_IDS = ALLERGY + "/ids";

	static final String ILLNESS = "/illness";

	static final String ILLNESS_BY_IDS = ILLNESS + "/ids";

	static final String CLINIC_EMLPLOYEE_DETAILS_SPECIALTY = CLINIC_EMLPLOYEE_DETAILS + "/specialty";


	static final String SURGEON_CONTRACT = "/surgeon-contract";



	
}
