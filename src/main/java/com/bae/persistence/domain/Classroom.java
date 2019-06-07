package com.bae.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String trainer;

	public Classroom() {
	}

	public Classroom(int id, String trainer) {
		super();
		this.id = id;
		this.trainer = trainer;
	}

	public int getClassroomId() {
		return id;
	}

	public void setClassroomId(int classroomId) {
		this.id = classroomId;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

}
