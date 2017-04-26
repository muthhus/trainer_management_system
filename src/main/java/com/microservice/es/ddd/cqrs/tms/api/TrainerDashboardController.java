package com.microservice.es.ddd.cqrs.tms.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TrainerDashboardController {
	
	@RequestMapping("/dashboard")
	public String dashboard(){
		return "Dashboard";
	}

}
