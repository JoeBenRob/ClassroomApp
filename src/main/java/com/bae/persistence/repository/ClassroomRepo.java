package com.bae.persistence.repository;

public interface ClassroomRepo {

	public String CreateClasroom(String Classroom);

	public String GetClassroom(int id);

	public String GetAllClassroom();

	public String UpdateClassroom(String Classroom, int id);

	public String DeleteClassroom(int id);

}
