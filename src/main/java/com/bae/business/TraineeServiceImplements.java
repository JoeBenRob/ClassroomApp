package com.bae.business;

import javax.inject.Inject;

import com.bae.persistence.repository.TraineeRepo;

public class TraineeServiceImplements implements TraineeService {

	@Inject
	private TraineeRepo repo;

	@Override
	public String CreateTrainee(String Classroom) {
		return null;
	}

	@Override
	public String GetTrainee(int id) {
		return repo.GetTrainee(id);
	}

	@Override
	public String GetAllTrainee() {
		return repo.GetAllTrainee();
	}

	@Override
	public String UpdateTrainee(String Classroom, int id) {
		return null;
	}

	@Override
	public String DeleteTrainee(int id) {
		return null;
	}

}
