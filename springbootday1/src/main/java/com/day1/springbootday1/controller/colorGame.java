package com.day1.springbootday1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class colorGame {
	@Value("${colorChange}")
    private String color;
    @GetMapping("/display3")
    public String color(){
    	
		return "My favorite color is "+color;
    }
}
