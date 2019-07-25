package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin 
{
	Integer id;
	String name,mobile_no,password,email;
	
	public Admin() {
		super();
	}


	public Admin(Integer id, String name, String mobile_no, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.mobile_no = mobile_no;
		this.password = password;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	@Column(length=20)
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Column(length=20)
	public String getMobile_no() {
		return mobile_no;
	}


	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	@Column(length=20)
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Column(length=20)
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", mobile_no=" + mobile_no + ", password=" + password + ", email="
				+ email + "]";
	}

	
	

}
