package com.app.dao;

import com.app.pojos.Admin;
import com.app.pojos.Admin;

public interface IAdminDao {
	String registerAdmin(Admin a);

	Admin validateAdmin(String email, String password);

	Object listPizza();
	


}
