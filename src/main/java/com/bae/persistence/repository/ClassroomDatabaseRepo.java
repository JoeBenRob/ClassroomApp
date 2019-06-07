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
	public String createClassroom(String Classroom) {
		return null;
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
	public String updateClassroom(String Classroom, int id) {
		return null;
	}

	@Override
	public String deleteClassroom(int id) {
		return null;
	}

}
