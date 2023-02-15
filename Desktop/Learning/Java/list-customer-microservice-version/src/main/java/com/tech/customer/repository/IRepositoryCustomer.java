package com.tech.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.customer.entity.Customer;

@Repository
public interface IRepositoryCustomer extends JpaRepository<Customer, Long>{

}
