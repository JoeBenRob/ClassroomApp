package com.bae.persistence.repository;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.bae.persistence.domain.Classroom;
import com.bae.util.JSONUtil;

@Transactional(TxType.SUPPORTS)
@Default
public class ClassroomDatabaseRepo implements ClassroomRepo {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Override
	public String createClassroom(String classroom) {
		Classroom aClassroom = util.getObjectForJSON(classroom, Classroom.class);
		manager.persist(aClassroom);

		return "{\"message\": \"classroom has been sucessfully added\"}";
	}

	@Override
	public String getClassroom(int id) {
		return util.getJSONForObject(manager.find(Classroom.class, id));
	}

	@Override
	public String getAllClassroom() {
		Query query = manager.createQuery("Select a FROM Classroom a");
		Collection<Classroom> classroom = (Collection<Classroom>) query.getResultList();
		return util.getJSONForObject(classroom);
	}

	@Override
	public String updateClassroom(String classroom, int id) {
		Classroom newClassroom = util.getObjectForJSON(classroom, Classroom.class);
		Classroom oldClassroom = manager.find(Classroom.class, id);

		if (oldClassroom != null) {
			oldClassroom.setTrainer(newClassroom.getTrainer());
		}
		manager.persist(oldClassroom);
		return "{\"message\": \"classroom has been sucessfully updated\"}";
	}

	@Override
	public String deleteClassroom(int id) {
		Classroom classroom = util.getObjectForJSON(getClassroom(id), Classroom.class);
		if (manager.contains(manager.find(Classroom.class, id))) {
			manager.remove(manager.find(Classroom.class, id));
		}
		;
		return "{\"message\": \"classroom has been sucessfully deleted\"}";
	}

}
