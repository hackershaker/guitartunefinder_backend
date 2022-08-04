package com.project.guitarfinder.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPageController {
	@RequestMapping("/hello")
	public String mainpage() {
		return "Hello!";
	}
}
