package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.CustomerService;
import com.example.payload.CustomerDtos;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sunbase/portal/api/")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping("/addCustomer")
	public ResponseEntity<CustomerDtos> registerNewCustomer(@Valid @RequestBody CustomerDtos customer){
		CustomerDtos newCustomer = customerService.createNewCustomer(customer);
		return new ResponseEntity<CustomerDtos>(newCustomer, HttpStatus.CREATED);
	}

}
