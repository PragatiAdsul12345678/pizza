package com.app.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.app.pojos.*;
@Repository
@Transactional
public class OrderDaoImp implements IOrderDao {

	@Autowired
	private SessionFactory sf;
	
	

	@Override
	public void addOrder(Orders order) {
		sf.getCurrentSession().saveOrUpdate(order);
		
	}

	
}


