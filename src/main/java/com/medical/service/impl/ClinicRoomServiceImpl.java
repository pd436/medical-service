package com.medical.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.medical.model.PatientAdmissions;
import com.medical.repository.NursingUnitRepository;
import com.medical.repository.PatientAdmissionRepository;
import com.medical.response.ClinicRooms;
import com.medical.service.ClinicRoomService;
import com.medical.util.Constants.AllotmentType;
import com.medical.util.Constants.NursingUnitType;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ClinicRoomServiceImpl implements ClinicRoomService {

	@Autowired
	PatientAdmissionRepository patientAdmissionRepository;

	@Autowired
	NursingUnitRepository nursingUnitRepository;

	@Override
	public List<ClinicRooms> getClinicRooms(NursingUnitType type) {
		List<ClinicRooms> response = new ArrayList<>();
		try {
			if (StringUtils.isNoneBlank(type.toString())) {

				switch (type) {
				case occupied:
					response = patientAdmissionRepository.getOccupiedRooms();
					break;
				case available:
					response = patientAdmissionRepository.getAvailableRooms();
					break;
				case all:
					response = nursingUnitRepository.getAllRooms();
					break;
				default:
					log.error("Invalid Nursing Unit Type, sending an  empty response");
				}
			}
		} catch (Exception e) {
			log.error("Exception while retriving patient details:" + e);
		}

		return response;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateClinicRoomForPatient(Integer patientId, Integer roomId, AllotmentType type) {
		try {
			if (StringUtils.isNoneBlank(type.toString())) {

				switch (type) {
				case assign:
					
					PatientAdmissions nursingDetails = patientAdmissionRepository.getAdmissionDetailsById(roomId);
					
					if(nursingDetails!=null  &&
							Integer.compare(patientId, nursingDetails.getPatientId())!=0) {
						throw new Exception("There is already a patient assigned the the room");
					}
					
					var pd = PatientAdmissions.builder().patientId(patientId).nursingUnitId(roomId).build();
					patientAdmissionRepository.save(pd);
					break;
				case remove:
					patientAdmissionRepository.deleteByRoomIdAndPatientId(patientId, roomId);
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
	public List<ClinicRooms> getClinicRoomsByPatientId(Integer patientId) {
		List<ClinicRooms> response = new ArrayList<>();
		try {
			response = patientAdmissionRepository.getRoomsByPatientId(patientId);
		} catch (Exception e) {
			log.error("Exception while retriving Room for a patient: " + patientId + " " + e);
		}
		return response;
	}

}
