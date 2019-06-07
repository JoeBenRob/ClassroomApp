package com.bae.rest;

import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.bae.business.ClassroomService;

@Path("/Classroom")
public class ClassroomEndpoint {

	@Inject
	ClassroomService service;

	@Path("/getClassroom/{id}")
	@GET
	public String getClassroom(@PathParam("id") int id) {
		return service.GetClassroom(id);
	}

	@Path("/getAllClassroom")
	@GET
	public String getAllClassroom() {
		return service.GetAllClassroom();
	}

}
