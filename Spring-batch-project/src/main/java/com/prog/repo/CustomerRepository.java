package com.prog.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prog.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

}
