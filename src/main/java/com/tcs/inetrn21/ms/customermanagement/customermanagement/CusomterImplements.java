package com.tcs.inetrn21.ms.customermanagement.customermanagement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CusomterImplements implements CustomerDao {
	
	
	private CustomerRepository repo;
	public CusomterImplements(CustomerRepository therepo) {
		repo=therepo;
	}
	
	
	@Override
	@Transactional
	public List<CustomerEntity> findAll() {
		return repo.findAll();
	}

	@Override
	@Transactional
	public CustomerEntity findById(int customer_id) {
		Optional<CustomerEntity> finalresult = repo.findById(customer_id);
		CustomerEntity thecustomer=null;    
		if(finalresult.isPresent()) {
			
			thecustomer=finalresult.get();
		}
		
		else {   
		}
		return thecustomer;
	}

	@Override
	@Transactional
	public void save(CustomerEntity customer) {
		repo.save(customer);
	

	}

	@Override
	@Transactional
	public void deletebyid(int customer_id) {
		
		repo.deleteById(customer_id);
	}
	
	
}
