package com.tech.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.customer.entity.Customer;
import com.tech.customer.repository.IRepositoryCustomer;
@Service
public class ServiceCustomer implements IServiceCustomer{
	@Autowired
	private IRepositoryCustomer repositoryCustomer;
	@Override
	public List<Customer> all() {	
		return this.repositoryCustomer.findAll();
	}

}
