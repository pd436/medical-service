package com.medical.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.medical.model.SurgerySchedule;
import com.medical.repository.SurgeryScheduleRepository;
import com.medical.response.SurgeryView;
import com.medical.service.SurgeryService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SurgeryServiceImpl implements SurgeryService {

	@Autowired
	SurgeryScheduleRepository surgeryScheduleRepository;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public SurgerySchedule bookSurgerySchedule(SurgerySchedule scheduleRequest) {
		SurgerySchedule s1 = new SurgerySchedule();
		try {
			s1 = surgeryScheduleRepository.save(scheduleRequest);
		} catch (Exception e) {
			log.error("Exception occoured in booking Surgery " + e.getMessage());
		}
		return s1;
	}

	@Override
	public List<SurgerySchedule> getSurgeryList() {
		return surgeryScheduleRepository.getSurgeries();
	}

	@Override
	public List<SurgeryView> getSurgeonViewDetails() {
		List<SurgeryView> response = new ArrayList<>();
		try {
			List<Tuple> typesTuple = surgeryScheduleRepository.getSurgeryListSurgeonsOverView();

			response = typesTuple
					.stream().map(t -> new SurgeryView(t.get(0, Integer.class), t.get(1, Integer.class),
							t.get(2, String.class), t.get(3, String.class), t.get(4, String.class)))
					.collect(Collectors.toList());

		} catch (Exception e) {

			log.error("Exception occoured in retriving the Surgeon OverView" + e.getMessage());
		}
		return response;
	}
	
	@Override
	public List<SurgeryView> getSurgeryDetailsByClinicEmployee(Integer clinicEmployeeId) {
		List<SurgeryView> response = new ArrayList<>();
		try {
			List<Tuple> typesTuple = surgeryScheduleRepository.getSurgeryListBySurgeonId(clinicEmployeeId);

			response = typesTuple.stream()
					.map(t -> new SurgeryView(
							t.get(0, String.class),
							t.get(1, Timestamp.class).toLocalDateTime(),
							t.get(2, String.class),
							t.get(3, String.class),
							t.get(4, String.class),
							t.get(5, Integer.class),
							t.get(6, String.class),
							t.get(7, Character.class).toString()
							))
					.collect(Collectors.toList());

		} catch (Exception e) {
			log.error("Exception occoured in retriving the Surgeon View by id" + e.getMessage());
		}
		return response;
	}

	@Override
	public List<SurgeryView> getPatientViewDetails() {
		List<SurgeryView> response = new ArrayList<>();
		try {
			List<Tuple> typesTuple = surgeryScheduleRepository.getSurgeryListPatientOverView();

			response = typesTuple.stream()
					.map(t -> new SurgeryView(t.get(0, Integer.class), t.get(1, String.class), t.get(2, String.class)))
					.collect(Collectors.toList());

		} catch (Exception e) {
			log.error("Exception occoured in retriving the Patient OverView" + e.getMessage());
		}
		return response;
	}
	
	@Override
	public List<SurgeryView> getSurgeryDetailsByPatientId(Integer patientId) {
		List<SurgeryView> response = new ArrayList<>();
		try {
			List<Tuple> typesTuple = surgeryScheduleRepository.getSurgeryListByPatientId(patientId);

			response = typesTuple.stream()
					.map(t -> new SurgeryView(
							t.get(0, String.class),
							t.get(1, String.class),
							t.get(2, String.class),
							t.get(3, Timestamp.class).toLocalDateTime(),
							t.get(4, String.class),
							t.get(5, String.class),
							t.get(6, String.class),
							t.get(7, Integer.class),
							t.get(8, String.class),
							t.get(9, Character.class).toString()
							))
					.collect(Collectors.toList());

		} catch (Exception e) {
			log.error("Exception occoured in retriving the Patient View by id" + e.getMessage());
		}
		return response;
	}
	
}