package com.bae.rest;

import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.bae.business.TraineeService;

@Path("/trainee")
public class TraineeEndpoint {

	@Inject
	TraineeService service;

	@Path("/getTrainee/{id}")
	@GET
	public String getTrainee(@PathParam("id") int id) {
		return service.GetTrainee(id);
	}

	@Path("/getAllTrainee")
	@GET
	public String getAllTrainee() {
		return service.GetAllTrainee();
	}
}