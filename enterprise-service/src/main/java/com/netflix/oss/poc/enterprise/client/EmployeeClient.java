package com.netflix.oss.poc.enterprise.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("employee-service")
public interface EmployeeClient {

    @RequestMapping(method = RequestMethod.GET, path = "/api/message")
    String getMessage();

}