package com.app.service;

import java.util.List;

import com.app.pojos.Customer;

import com.app.pojos.Pizza;
import com.app.pojos.Customer;

public interface ICustomerService
{
	String registerCustomer(Customer c);

	Customer validateCustomer(String email, String password);
	List<Pizza> PizzaList();

	Customer getCustomerByCustomername(String cname);

}
