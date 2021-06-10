package com.tcs.inetrn21.ms.customermanagement.customermanagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="CustomerEntity")
@Entity
public class CustomerEntity {
	@Id
	@GeneratedValue
	private Integer customer_id;
	private String address;
	private String contact_number;
	private String name;
	private String password;
	
	
	protected CustomerEntity()
	{
		
	}


	public CustomerEntity(Integer customer_id, String address, String contact_number, String name, String password) {
		super();
		this.customer_id = customer_id;
		this.address = address;
		this.contact_number = contact_number;
		this.name = name;
		this.password = password;
	}


	public Integer getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContact_number() {
		return contact_number;
	}


	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", address=" + address + ", contact_number=" + contact_number
				+ ", name=" + name + ", password=" + password + "]";
	}
	
}
	


