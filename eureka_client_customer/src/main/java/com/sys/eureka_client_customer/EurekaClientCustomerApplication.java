package com.sys.eureka_client_customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/customer")
public class EurekaClientCustomerApplication {

	@RequestMapping("/hello")
	public String sayHello(){
		return "hello customer, welcome!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientCustomerApplication.class, args);
	}
}
