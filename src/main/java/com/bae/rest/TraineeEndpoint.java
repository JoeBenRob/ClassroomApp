package com.bae.rest;

import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import com.bae.business.TraineeService;

@Path("/Trainee")
public class TraineeEndpoint {

	@Inject
	TraineeService service;

	@Path("/createTrainee/{trainee}")
	@POST
	public String createTrainee(@PathParam("trainee") String trainee) {
		return service.createTrainee(trainee);
	}

	@Path("/getTrainee/{id}")
	@GET
	public String getTrainee(@PathParam("id") int id) {
		return service.getTrainee(id);
	}

	@Path("/getAllTrainee")
	@GET
	public String getAllTrainee() {
		return service.getAllTrainee();
	}

	@Path("/updateTrainee/{id}")
	@PUT
	public String updateTrainee(@PathParam("id") int id) {
		return null;

	}

	@Path("/deleteTrainee/{id}")
	@DELETE
	public String deleteTrainee(@PathParam("id") int id) {
		return service.deleteTrainee(id);

	}

}