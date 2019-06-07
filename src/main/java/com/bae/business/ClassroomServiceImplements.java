package com.bae.business;

import javax.inject.Inject;

import com.bae.persistence.repository.ClassroomRepo;

public class ClassroomServiceImplements implements ClassroomService {

	@Inject
	private ClassroomRepo repo;

	@Override
	public String createClasroom(String classroom) {
		return repo.createClassroom(classroom);
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
	public String updateClassroom(String classroom, int id) {
		return repo.updateClassroom(classroom, id);
	}

	@Override
	public String deleteClassroom(int id) {
		return repo.deleteClassroom(id);
	}

}
