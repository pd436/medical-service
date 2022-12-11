package com.medical.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.model.NursingUnit;
import com.medical.repository.NursingUnitRepository;
import com.medical.repository.SurgeryTypeRepository;
import com.medical.response.SurgeryTypes;
import com.medical.service.ReferenceService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ReferenceServiceImpl implements ReferenceService {

	@Autowired
	NursingUnitRepository nursingUnitRepository;

	@Autowired
	SurgeryTypeRepository surgeryTypeRepository;

	@Override
	public List<NursingUnit> getNursingUnits() {
		return nursingUnitRepository.findAll();
	}

	@Override
	public List<SurgeryTypes> getSurgeryTypes() {
		List<SurgeryTypes> response = new ArrayList<>();
		try {
			List<Tuple> typesTuple = surgeryTypeRepository.getSurrgetTypesForClinic();

			response = typesTuple.stream()
					.map(t -> new SurgeryTypes(t.get(0, Integer.class), t.get(1, String.class), t.get(2, String.class),
							t.get(3, String.class), t.get(4, Integer.class), t.get(5, String.class)))
					.collect(Collectors.toList());

		} catch (Exception e) {

			log.error("Exception occoured in retriving the Surgery Types" + e.getMessage());
		}
		return response;

	}

}
