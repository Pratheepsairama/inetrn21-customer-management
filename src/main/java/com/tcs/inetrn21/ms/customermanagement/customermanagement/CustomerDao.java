package com.tcs.inetrn21.ms.customermanagement.customermanagement;


import java.util.List;


import org.springframework.stereotype.Component;



@Component
public interface CustomerDao {
	public List<CustomerEntity> findAll();
	
	public CustomerEntity findById(int customer_id);
	
	public void save(CustomerEntity customer);
	
	public void deletebyid(int customer_id);
}

