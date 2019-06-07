package com.bae.business;

import javax.inject.Inject;

import com.bae.persistence.repository.TraineeRepo;

public class TraineeServiceImplements implements TraineeService {

	@Inject
	private TraineeRepo repo;

	@Override
	public String createTrainee(String Classroom) {
		return null;
	}

	@Override
	public String getTrainee(int id) {
		return repo.getTrainee(id);
	}

	@Override
	public String getAllTrainee() {
		return repo.getAllTrainee();
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
