package com.app.dao;

import java.util.List;

import com.app.pojos.Customer;
import com.app.pojos.Pizza;
import com.app.pojos.Pizza;

public interface ICustomerDao 
{
	public String registerCustomer(Customer c);

	public Customer validateCustomer(String cemail, String cpassword);
	
	public List<Pizza> PizzaList();

	public Customer getCustomerByCustomername(String cname);



}



