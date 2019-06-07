package com.bae.rest;

import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.bae.business.ClassroomService;

@Path("/Classroom")
public class ClassroomEndpoint {

	@Inject
	ClassroomService service;

	@Path("/createClassroom/{classroom}")
	@POST
	@Produces({ "application/json" })
	public String createClassroom(@PathParam("classroom") String classroom) {
		return service.createClasroom(classroom);
	}

	@Path("/getClassroom/{id}")
	@GET
	@Produces({ "application/json" })
	public String getClassroom(@PathParam("id") int id) {
		return service.getClassroom(id);
	}

	@Path("/getAllClassroom")
	@GET
	@Produces({ "application/json" })
	public String getAllClassroom() {
		return service.getAllClassroom();
	}

	@Path("/updateClassroom/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateClassroom(@PathParam("id") int id) {
		return null;

	}

	@Path("/deleteClassroom/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteClassroom(@PathParam("id") int id) {
		return service.deleteClassroom(id);
	}

}
