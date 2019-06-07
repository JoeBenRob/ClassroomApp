package com.bae.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;

	public Trainee() {
	}

	public Trainee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getTraineeId() {
		return id;
	}

	public void setTraineeId(int traineeId) {
		this.id = traineeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
