package com.bae.rest;

import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.bae.business.TraineeService;

@Path("/Trainee")
public class TraineeEndpoint {

	@Inject
	TraineeService service;

	@Path("/createTrainee/{trainee}")
	@POST
	@Produces({ "application/json" })
	public String createTrainee(@PathParam("trainee") String trainee) {
		return service.createTrainee(trainee);
	}

	@Path("/getTrainee/{id}")
	@GET
	@Produces({ "application/json" })
	public String getTrainee(@PathParam("id") int id) {
		return service.getTrainee(id);
	}

	@Path("/getAllTrainee")
	@GET
	@Produces({ "application/json" })
	public String getAllTrainee() {
		return service.getAllTrainee();
	}

	@Path("/updateTrainee/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateTrainee(@PathParam("id") int id) {
		return null;

	}

	@Path("/deleteTrainee/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteTrainee(@PathParam("id") int id) {
		return service.deleteTrainee(id);

	}

}