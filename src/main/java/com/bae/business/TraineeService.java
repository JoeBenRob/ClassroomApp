package com.bae.business;

public interface TraineeService {

	public String createTrainee(String Classroom);

	public String getTrainee(int id);

	public String getAllTrainee();

	public String updateTrainee(String Classroom, int id);

	public String deleteTrainee(int id);

}
