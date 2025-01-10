package com.advancia.stage.jenkins_test_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class Controller {

	@GetMapping("/test")
	public ResponseEntity<String> getMethodName() {
		return new ResponseEntity<String>("ciao", HttpStatus.OK);
	}
	
	
}
