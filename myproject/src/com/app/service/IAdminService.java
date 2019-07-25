package com.app.service;

import com.app.pojos.Admin;

public interface IAdminService {

	String registerAdmin(Admin a);

	Admin validateAdmin(String aemail, String apassword);

}
