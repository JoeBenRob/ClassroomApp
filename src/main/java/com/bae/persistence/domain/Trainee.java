package com.bae.persistence.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Trainee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int traineeId;
	private String name;

	public Trainee() {
	}

	public Trainee(int traineeId, String name) {
		super();
		this.traineeId = traineeId;
		this.name = name;
	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
