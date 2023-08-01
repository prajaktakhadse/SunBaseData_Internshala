package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.repository.CustomerRepo;

@Service
public class CustomerServiceimpl implements CustomerService{
	
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public Customer createNewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer saveCustomer = customerRepo.save(customer);
		return saveCustomer;
	}

}
