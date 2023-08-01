package com.example.payload;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class CustomerDtos {

	@Column(name = "first_name" , nullable = false , length = 100) 
	 private String first_name;
	  

	  private String last_name;
	  
	  private String street;
	  
	
	  private String address;
	  
	
	  private String city;
	  
	
	  private String state;
	  
	
	@Email
	  private String email;
	  
	
	  private String phone;
}
