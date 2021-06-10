package com.tcs.inetrn21.ms.customermanagement.customermanagement;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity ,Integer> {

}
