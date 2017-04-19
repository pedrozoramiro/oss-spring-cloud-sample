package com.netflix.oss.poc.enterprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.oss.poc.enterprise.client.EmployeeClient;

@RefreshScope
@RestController
@RequestMapping(value= "/api", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
@EnableFeignClients(basePackages = {"com.netflix.oss.poc.employee.controller", "com.netflix.oss.poc.enterprise.client"})
public class EnterpriseController {

	
	@Autowired
    private EmployeeClient employeeService;
	
	@Value("${message}")
	private String message;
	
	@RequestMapping(value="/message", method = RequestMethod.GET)
	public ResponseEntity<String> getMessage() {
		
		String messageOfEmplyeeService = employeeService.getMessage();
		
		return new ResponseEntity<String>(messageOfEmplyeeService.concat(message), HttpStatus.OK);
	} 
}
