package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Admin;
import com.app.pojos.Admin;
@Repository
@Transactional
public class ImpAdminDao implements IAdminDao {

	@Autowired // byType
	private SessionFactory sf;
	public ImpAdminDao() 
	{
		System.out.println("in cnstr of " + getClass().getName());
	}
	@Override
	public String registerAdmin(Admin a) {
		System.out.println("in Admin reg form..."+a);
		sf.getCurrentSession().persist(a);
		return "Admin details inserted for Admin ID "+a.getId();
	}

	@Override
	public Admin validateAdmin(String email, String password) {
		String jpql = "select a from Admin a where a.email=:em and a.password=:pa";
		return sf.getCurrentSession().createQuery(jpql, Admin.class).setParameter("em", email).setParameter("pa", password)
				.getSingleResult();
	}
	@Override
	public Object listPizza() {
		// TODO Auto-generated method stub
		return null;
	}

}
