package com.prog.config;

import org.springframework.batch.item.ItemProcessor;

import com.prog.entity.Customer;


public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer item) throws Exception {

		

		return item;
	}

}