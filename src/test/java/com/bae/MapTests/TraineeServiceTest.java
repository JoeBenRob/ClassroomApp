package com.bae.MapTests;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;

import com.bae.persistence.domain.Trainee;
import com.bae.persistence.repository.TraineeRepo;
import com.bae.util.JSONUtil;

public class TraineeServiceTest {

	private JSONUtil jsonUtil;
	@Inject
	private TraineeRepo tmr;
	private Trainee trainee1;
	private Trainee trainee2;
	private String trainee1JSON = "{\"id\":7, \"name\"\":Jack Flanagan\"}";
	private String trainee2JSON = "{\"id\":8, \"name\":\"Thi Nyugen\"}";

	@Before
	public void setup() {
	}

	@Test
	public void addTrainee() {
		tmr.createTrainee(trainee1JSON);
		assertEquals("Jack Flanagan", tmr.getTrainee(7));
	}
}
