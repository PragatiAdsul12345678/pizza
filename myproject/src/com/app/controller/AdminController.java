package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dao.IAdminDao;
import com.app.pojos.Admin;

@Controller
@RequestMapping("/admin")
public class AdminController 
{@Autowired
	private IAdminDao service;

	public AdminController() {
		System.out.println("in constr of " + getClass().getName());
	}


	@GetMapping("/registration")
	public String showRegForm(Admin a) {
		
		System.out.println("in show reg form "+a);
			return "/Admin/registration"; 
	}
	@PostMapping("/registration")
	public String processRegForm(Admin a,Model map)
	{
		System.out.println("in process reg form "+a);
		map.addAttribute("status",service.registerAdmin(a));
		return "redirect:/Admin/list";
	}
	
	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/Admin/login";
	}
	
	@PostMapping("/login") // =@RequestMapping + method=post
	public String processLoginForm(Model map, 
			@RequestParam String email,
			@RequestParam String password,
			HttpSession hs) {
		System.out.println("in process login form");
		try {
			// invoke service layer method
			Admin a = service.validateAdmin(email, password);
			// login success
			map.addAttribute("status", "Login Successful....");
			// store user details under session scope
			hs.setAttribute("user_dtls", a);
			// chk role
			if (a.getEmail().equals("admin")&& a.getPassword().equals("admin"))
			{
					return "redirect:/Admin/list";//replace by redirect
			}
			else
				
			// vendor login
			return "/Admin/details";
		} catch (RuntimeException e) {
			System.out.println("err in user controller " + e);
			// invalid login
			// add err mesg as model attribute ---req scope
			map.addAttribute("status", "Invalid Login , Pls retry!!!!");
			return "/Admin/login";
		}
		

	}
	
	
	
}



