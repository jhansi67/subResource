package com.rest.api.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.rest.api.model.Car;

public class CarResource {
	@GET
	@Path("{registraionId}")
	public Car getCarDetails(@PathParam("id") Long id, @PathParam("registraionId") String regitrationId) {
		System.out.println("getCarDetails...>");
		return new Car(regitrationId, "RD520");
	}
	
	@GET
	//@Path("{registraionId}")
	public String getHelloCar() {
		System.out.println("getCarDetails...>");
		return " getHelloCar()";
	}

}
