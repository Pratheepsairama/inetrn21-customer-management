package com.tcs.inetrn21.ms.customermanagement.customermanagement;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerResoucre {

private CustomerDao customerservice;   
	
	@Autowired
	public  void Controller (CustomerDao service) {
		customerservice = service;
	}
	@GetMapping("/customers")
	public List<CustomerEntity> findAll() {
		return customerservice.findAll();
	}

	
		@GetMapping("/customers/{customer_id}")
		public CustomerEntity getEmployee(@PathVariable int customer_id) {
			
			CustomerEntity theCustomer = customerservice.findById(customer_id);
			
			if (theCustomer == null) {
				throw new CustomerNotFoundExceptionClass("customer id not found - " + customer_id);  // not defining runtime exception uses aour own exception
			}
			
			return theCustomer;
		}
		
		
		@PostMapping("/customers")
		public CustomerEntity addEmployee(@RequestBody CustomerEntity theCustomer) {
			theCustomer.setCustomer_id(0);
			customerservice.save(theCustomer);
			
			return theCustomer;
		}
		
		
		@DeleteMapping("/customers/{customer_id}")
		public String deleteEmployee(@PathVariable int customer_id) {
			
			CustomerEntity tempCustomer = customerservice.findById(customer_id);
			
			if (tempCustomer == null) {
				throw new CustomerNotFoundExceptionClass("Employee id not found - " + customer_id);
			}
			
			customerservice.deletebyid(customer_id);
			
			return "Deleted employee id :- " + customer_id;
		}
		
		
		@PostMapping("/login/{customer_id}")
		public String validateEmployee(@PathVariable int customer_id, @RequestBody CustomerEntity customer)
		{
			CustomerEntity tempCustomer = customerservice.findById(customer_id);
			
			if((tempCustomer.getName()).equals(tempCustomer.getName()) && tempCustomer.getPassword().equals(customer.getPassword()))
			{
				return "correct match";
			      
			}
			else {
			return "invalid match";
		}
}}
