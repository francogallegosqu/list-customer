package com.tech.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ListCustomerMicroserviceVersionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListCustomerMicroserviceVersionApplication.class, args);
	}

}
