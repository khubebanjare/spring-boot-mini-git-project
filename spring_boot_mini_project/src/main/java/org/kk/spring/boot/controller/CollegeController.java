package org.kk.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/college")
public class CollegeController{

	@RequestMapping ("/message")
	public String newMessage() {
		return "Welcome to Spring Boot Git Project to GitHub";
	}
}
