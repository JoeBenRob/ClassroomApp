package com.bae.persistence.repository;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.bae.persistence.domain.Trainee;
import com.bae.util.JSONUtil;

@Transactional(TxType.SUPPORTS)
@Default
public class TraineeDatabaseRepo implements TraineeRepo {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Override
	public String CreateTrainee(String Classroom) {
		return null;
	}

	@Override
	public String GetTrainee(int id) {
		return util.getJSONForObject(manager.find(Trainee.class, id));
	}

	@Override
	public String GetAllTrainee() {
		Query query = manager.createQuery("Select a FROM Classroom a");
		Collection<Trainee> trainee = (Collection<Trainee>) query.getResultList();
		return util.getJSONForObject(trainee);
	}

	@Override
	public String UpdateTrainee(String Classroom, int id) {
		return null;
	}

	@Override
	public String DeleteTrainee(int id) {
		return null;
	}

}
