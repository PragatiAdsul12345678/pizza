package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dao.ICustomerDao;
import com.app.pojos.Customer;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	// dependency
	@Autowired
	private ICustomerDao service;

	public CustomerController() {
		System.out.println("in constr of " + getClass().getName());
	}


	@GetMapping("/registration")
	public String showRegForm(Customer c) {
		
		System.out.println("in show reg form "+c);
			return "/customer/registration"; 
	}
	@PostMapping("/registration")
	public String processRegForm(Customer c,Model map)
	{
		System.out.println("in process reg form "+c);
		map.addAttribute("status",service.registerCustomer(c));
		return "redirect:/customer/list";
	}
	
	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/customer/login";
	}
	
	@PostMapping("/login") // =@RequestMapping + method=post
	public String processLoginForm(Model map, 
			@RequestParam String cemail,
			@RequestParam String cpassword,
			HttpSession hs) {
		System.out.println("in process login form");
		try {
			// invoke service layer method
			Customer c = service.validateCustomer(cemail, cpassword);
			// login success
			map.addAttribute("status", "Login Successful....");
			// store user details under session scope
			hs.setAttribute("user_dtls", c);
			// chk role
			if (c.getCemail().equals("admin")&& c.getCpassword().equals("admin"))
			{
					return "redirect:/customer/list";//replace by redirect
			}
			else
				
			// vendor login
			return "/customer/details";
		} catch (RuntimeException e) {
			System.out.println("err in user controller " + e);
			// invalid login
			// add err mesg as model attribute ---req scope
			map.addAttribute("status", "Invalid Login , Pls retry!!!!");
			return "/customer/login";
		}
		
		

	}
	
	
	@GetMapping("/pizza")
	public String showFoodItemList(Model map) {
		System.out.println("in FoodItemlist vendor");
		map.addAttribute("Pizza_pizza_list", service.PizzaList());
		return "/customer/pizzalist"; 
	}
	
}
