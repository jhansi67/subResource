package com.rest.api.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.api.model.Person;

@Path("/person")
@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class PersonResource {

	public PersonResource() {
		System.out.println("PersonResource...");
	}

	@GET
	@Path("/{id}")

	public Person getPersonDetails(@PathParam("id") Long id) {
		System.out.println("Get Person Details..");
		return new Person(id, "Default");
	}

	// @GET
	@Path("/{id}/car")
	// @Produces(MediaType.APPLICATION_JSON)
	public CarResource getCarResource(
	// @PathVariable("id") Long id, @PathVariable("registraionId") String
	// registraionId
	) {
		System.out.println("attempts to Subresource..");
		return new CarResource();
	}

}
