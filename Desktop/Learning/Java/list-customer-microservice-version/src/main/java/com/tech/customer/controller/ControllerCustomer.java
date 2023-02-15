package com.tech.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.customer.entity.Customer;
import com.tech.customer.exception.ServerException;
import com.tech.customer.service.IServiceCustomer;

@RestController
@RequestMapping("/api/users")
public class ControllerCustomer {
	@Autowired
	private IServiceCustomer serviceCustomer;
	
	
	//Find ALL
		@GetMapping("/")
		public ResponseEntity<List<Customer>> allCustomer() {
			try {
				List<Customer> newCustomer = this.serviceCustomer.all();
				return new ResponseEntity<List<Customer>>(newCustomer, HttpStatus.OK);
			}catch(Exception e) {
				throw new ServerException(e.getMessage());
			}
		}
}
