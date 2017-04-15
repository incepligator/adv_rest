package com.cubic.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

@Service
@Path("/helloworld")
public class HelloRest {
	
	
	@GET
	public String sayHello(){
		
		
		return "Welcomee to rest world ";
		
	}

	@GET
	@Path("/emp/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee findEmployeeById(@PathParam("id")final String id){
		
	Employee emp= new Employee();
	
	emp.setName("Shrawan");
	emp.setAge(30);
	return emp;
	}
	
	
}
