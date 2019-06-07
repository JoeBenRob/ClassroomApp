package com.bae.business;

import javax.inject.Inject;

import com.bae.persistence.repository.ClassroomRepo;

public class ClassroomServiceImplements implements ClassroomService {

	@Inject
	private ClassroomRepo repo;

	@Override
	public String createClasroom(String Classroom) {
		return null;
	}

	@Override
	public String getClassroom(int id) {
		return repo.getClassroom(id);
	}

	@Override
	public String getAllClassroom() {
		return repo.getAllClassroom();
	}

	@Override
	public String updateClassroom(String Classroom, int id) {
		return null;
	}

	@Override
	public String deleteClassroom(int id) {
		return null;
	}

}
