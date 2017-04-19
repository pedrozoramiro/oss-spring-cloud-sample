package com.netflix.oss.poc.employee.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping(value= "/api", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
public class EmployeeController {

	@Value("${message}")
	private String message;
	
	@RequestMapping(value="/message", method = RequestMethod.GET)
	public ResponseEntity<String> getMessage() {
		return new ResponseEntity<String>(message, HttpStatus.OK);
	} 
}
