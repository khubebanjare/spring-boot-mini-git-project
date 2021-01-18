package org.kk.spring.boot.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
public class IndexController {

	@RequestMapping ("/")
	public String indexPage() {
		return "index";
	}
}
