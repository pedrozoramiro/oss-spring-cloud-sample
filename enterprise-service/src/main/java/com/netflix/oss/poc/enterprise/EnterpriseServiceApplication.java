package com.netflix.oss.poc.enterprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class EnterpriseServiceApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EnterpriseServiceApplication.class, args);
	}
	
	
}
