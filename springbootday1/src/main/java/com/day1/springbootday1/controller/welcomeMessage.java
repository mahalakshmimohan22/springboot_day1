package com.day1.springbootday1.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class welcomeMessage {
	@GetMapping("/display1")
	   public String welcome() {
		return "Welcome";
	}
}
