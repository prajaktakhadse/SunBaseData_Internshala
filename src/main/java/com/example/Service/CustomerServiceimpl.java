package com.example.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.payload.CustomerDtos;
import com.example.repository.CustomerRepo;

@Service
public class CustomerServiceimpl implements CustomerService{
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public CustomerDtos createNewCustomer(CustomerDtos customerDtos) {
		// TODO Auto-generated method stub
		Customer cus = this.modelMapper.map(customerDtos, Customer.class);
		Customer addCustomer = this.customerRepo.save(cus);
		return this.modelMapper.map(addCustomer, CustomerDtos.class);
	}

}
