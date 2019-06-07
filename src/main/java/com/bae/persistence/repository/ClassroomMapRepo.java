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
	public String createClassroom(String classroom) {
		Classroom CR = util.getObjectForJSON(classroom, Classroom.class);
		classroomMap.put(CR.getClassroomId(), CR);
		return "Classroom added";
	}

	@Override
	public String getClassroom(int id) {
		return classroomMap.get(id).toString();
	}

	@Override
	public String getAllClassroom() {
		return util.getJSONForObject(classroomMap);
	}

	@Override
	public String updateClassroom(String classroom, int id) {

		Classroom CR = util.getObjectForJSON(classroom, Classroom.class);
		classroomMap.replace(id, CR);
		return "Classroom updated";
	}

	@Override
	public String deleteClassroom(int id) {
		classroomMap.remove(id);
		return "Classroom deleted";
	}

}
