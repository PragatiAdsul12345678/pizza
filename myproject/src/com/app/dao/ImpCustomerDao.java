package com.app.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Customer;

import com.app.pojos.Pizza;


import java.util.List;

import org.hibernate.*;
@Repository
@Transactional
public class ImpCustomerDao implements ICustomerDao

{
	@Autowired // byType
	private SessionFactory sf;
	public ImpCustomerDao() 
	{
		System.out.println("in cnstr of " + getClass().getName());
	}
	


	@Override
	public String registerCustomer(Customer c)
	{
		System.out.println("in customer reg form..."+c);
		sf.getCurrentSession().persist(c);
		return "Customer details inserted for Customer ID "+c.getCid();
			
	}

	
	@Override
	public Customer validateCustomer(String cemail, String cpassword) {
		String jpql = "select c from Customer c where c.cemail=:em and c.cpassword=:pa";
		return sf.getCurrentSession().createQuery(jpql, Customer.class).setParameter("em", cemail).setParameter("pa", cpassword)
				.getSingleResult();
		
	}



	@Override
	public List<Pizza> PizzaList()
	{
		System.out.println("in cateogry");
		String jpql = "select p from Pizza p ";
		return sf.getCurrentSession().createQuery(jpql,Pizza.class).getResultList();
	}



	@Override
	public Customer getCustomerByCustomername(String cname) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


