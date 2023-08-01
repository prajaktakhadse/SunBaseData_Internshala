package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*	"first_name": "Jane",
	"last_name": "Doe",
	"street": "Elvnu Street",
	"address": "H no 2 ",
	"city": "Delhi",
	"state": "Delhi",
	"email": "sam@gmail.com",
	"phone": "12345678"
*/

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  private String first_name;
  
  private String last_name;
  
  private String street;
  
  private String address;
  
  private String city;
  
  private String email;
  
  private String phone;
  
  
  
  
  

}
