package com.bae.business;

import javax.inject.Inject;

import com.bae.persistence.repository.TraineeRepo;

public class TraineeServiceImplements implements TraineeService {

	@Inject
	private TraineeRepo repo;

	@Override
	public String createTrainee(String trainee) {
		return repo.createTrainee(trainee);
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
	public String updateTrainee(String trainee, int id) {
		return repo.updateTrainee(trainee, id);
	}

	@Override
	public String deleteTrainee(int id) {
		return repo.deleteTrainee(id);
	}

}
