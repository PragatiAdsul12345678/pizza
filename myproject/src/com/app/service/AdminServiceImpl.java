package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IAdminDao;
import com.app.pojos.Admin;

@Service 
@Transactional
public class AdminServiceImpl implements IAdminService {
	
	
	@Autowired
	private IAdminDao dao;

	@Override
	public String registerAdmin(Admin a) {
		// TODO Auto-generated method stub
		return dao.registerAdmin(a);
	}

	@Override
	public Admin validateAdmin(String email, String password) {
		// TODO Auto-generated method stub
		return dao.validateAdmin(email, password);
	}
}

