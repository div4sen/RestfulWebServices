package com.divyab.demorest;



import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResources {
	
	AlienRepository repo = new AlienRepository();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAliens () {
		
		System.out.println("Get Alien called.....");
	
		
		
		return repo.getAliens();
	}
	
	@POST
	@Path("alien")
	public Alien createAlien(Alien a1) {
		
		System.out.println("Inside create alien");
		repo.createAlien(a1);
		return a1;
		
	}
}
