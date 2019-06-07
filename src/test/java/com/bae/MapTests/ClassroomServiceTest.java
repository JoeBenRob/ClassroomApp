package com.bae.MapTests;

import org.junit.Before;
import org.junit.Test;

import com.bae.persistence.domain.Classroom;
import com.bae.persistence.repository.ClassroomMapRepo;

public class ClassroomServiceTest {

	private ClassroomMapRepo cmp;
	private Classroom classroom1;
	private Classroom classroom2;
	private String class1JSON = "{\"id\":6,\"name\":\"Ben Fisher\"}";
	private String class2JSON = "{\"id\":7,\"name\":\"Ahra Ko\"}";

	@Before
	public void setup() {

		cmp = new ClassroomMapRepo();
		classroom1 = new Classroom(1, "Ben Fisher");
		classroom2 = new Classroom(1, "Ahra Ko");
	}

	@Test
	public void addClassroomTest() {
	}

}
