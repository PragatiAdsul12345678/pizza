package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ICustomerDao;

import com.app.pojos.Customer;
import com.app.pojos.Pizza;

@Service 
@Transactional
public class CustomerServiceImpl implements ICustomerService {
	
	
	@Autowired
	private ICustomerDao dao;

	@Override
	public String registerCustomer(Customer c) {
		// TODO Auto-generated method stub
		return dao.registerCustomer(c);
	}

	@Override
	public Customer validateCustomer(String cemail, String cpassword) {
		// TODO Auto-generated method stub
		return dao.validateCustomer(cemail, cpassword);
	}

	

	@Override
	public List<Pizza> PizzaList() {
		System.out.println("In service of category");
		return dao.PizzaList();
	}

	@Override
	public Customer getCustomerByCustomername(String cname) {
		return dao.getCustomerByCustomername(cname);
	}

	

}
