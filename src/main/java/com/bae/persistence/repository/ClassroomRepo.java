package com.bae.persistence.repository;

public interface ClassroomRepo {

	public String createClassroom(String Classroom);

	public String getClassroom(int id);

	public String getAllClassroom();

	public String updateClassroom(String Classroom, int id);

	public String deleteClassroom(int id);

}
