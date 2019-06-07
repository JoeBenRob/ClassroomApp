package com.bae.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.bae.persistence.domain.Classroom;
import com.bae.util.JSONUtil;

@Alternative
public class ClassroomMapRepo implements ClassroomRepo {

	private Map<Integer, Classroom> classroomMap = new HashMap<Integer, Classroom>();

	@Inject
	private JSONUtil util;

	@Override
	public String CreateClasroom(String Classroom) {
		return null;
	}

	@Override
	public String GetClassroom(int id) {
		return classroomMap.get(id).toString();
	}

	@Override
	public String GetAllClassroom() {
		return util.getJSONForObject(classroomMap);
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
