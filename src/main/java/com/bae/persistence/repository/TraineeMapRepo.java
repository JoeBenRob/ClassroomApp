package com.bae.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.bae.persistence.domain.Trainee;
import com.bae.util.JSONUtil;

@Alternative
public class TraineeMapRepo implements TraineeRepo {

	private Map<Integer, Trainee> traineeMap = new HashMap<Integer, Trainee>();

	@Inject
	private JSONUtil util;

	@Override
	public String createTrainee(String Classroom) {
		return null;
	}

	@Override
	public String getTrainee(int id) {
		return traineeMap.get(id).toString();
	}

	@Override
	public String getAllTrainee() {
		return util.getJSONForObject(traineeMap);
	}

	@Override
	public String updateTrainee(String Classroom, int id) {
		return null;
	}

	@Override
	public String deleteTrainee(int id) {
		return null;
	}

}
