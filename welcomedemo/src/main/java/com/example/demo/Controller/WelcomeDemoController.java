package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeDemoController {
	@GetMapping("/login/{username}")
	public String login(@PathVariable("username") String username) {
		return "Login are succesfulled in "+username;
	}

}
