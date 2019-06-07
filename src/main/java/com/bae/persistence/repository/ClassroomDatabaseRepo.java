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
	public String CreateClasroom(String Classroom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetClassroom(int id) {
		return util.getJSONForObject(manager.find(Classroom.class, id));
	}

	@Override
	public String GetAllClassroom() {
		Query query = manager.createQuery("Select a FROM Classroom a");
		Collection<Classroom> classroom = (Collection<Classroom>) query.getResultList();
		return util.getJSONForObject(classroom);
	}

	@Override
	public String UpdateClassroom(String Classroom, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String DeleteClassroom(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
