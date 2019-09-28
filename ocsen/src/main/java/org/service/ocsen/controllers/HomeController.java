package org.service.ocsen.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String inex() {
		return "Welcome to Spring Boot ^.^!";
	}
}
