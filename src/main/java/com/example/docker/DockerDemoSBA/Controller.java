package com.example.docker.DockerDemoSBA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class Controller {
	
	@GetMapping("/get")
	public String sayHello() {
		return "Hello Spring Boot Docker";
	}

}
