package com.bae.business;

import javax.inject.Inject;

import com.bae.persistence.repository.ClassroomRepo;

public class ClassroomServiceImplements implements ClassroomService {

	@Inject
	private ClassroomRepo repo;

	@Override
	public String CreateClasroom(String Classroom) {
		return null;
	}

	@Override
	public String GetClassroom(int id) {
		return repo.GetClassroom(id);
	}

	@Override
	public String GetAllClassroom() {
		return repo.GetAllClassroom();
	}

	@Override
	public String UpdateClassroom(String Classroom, int id) {
		return null;
	}

	@Override
	public String DeleteClassroom(int id) {
		return null;
	}

}
