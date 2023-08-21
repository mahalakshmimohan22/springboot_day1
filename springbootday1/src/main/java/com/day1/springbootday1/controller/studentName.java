package com.day1.springbootday1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentName {
	@Value("${studentName}")
    private String name;
    @GetMapping("/display2")
    public String getName() {
    	
		return "Welcome "+name+"!";
    }
}
