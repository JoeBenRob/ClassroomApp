package com.bae.persistence.repository;

public interface TraineeRepo {

	public String CreateTrainee(String Classroom);

	public String GetTrainee(int id);

	public String GetAllTrainee();

	public String UpdateTrainee(String Classroom, int id);

	public String DeleteTrainee(int id);

}
