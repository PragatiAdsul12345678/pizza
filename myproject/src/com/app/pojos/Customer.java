package com.app.pojos;

import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="customer")
public class Customer {
	int Cid;
	String Cname,Cemail,Cmobno,Cpassword;
	private Cart cart;
	
	@OneToOne
	@JoinColumn(name="cartId")
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}

	private List<Orders> orders;
	
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL)//mandatory 
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
	
	
	public Customer() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}
	@Column(length=20)
	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}
	@Column(length=20,unique=true)
	public String getCemail() {
		return Cemail;
	}

	public void setCemail(String cemail) {
		Cemail = cemail;
	}
	@Column(length=20)
	public String getCmobno() {
		return Cmobno;
	}

	public void setCmobno(String cmobno) {
		Cmobno = cmobno;
	}
	@Column(length=20)
	public String getCpassword() {
		return Cpassword;
	}

	public void setCpassword(String cpassword) {
		Cpassword = cpassword;
	}

	public Customer(int cid, String cname, String cemail, String cmobno, String cpassword) {
		super();
		Cid = cid;
		Cname = cname;
		Cemail = cemail;
		Cmobno = cmobno;
		Cpassword = cpassword;
	}

	@Override
	public String toString() {
		return "Customer [Cid=" + Cid + ", Cname=" + Cname + ", Cemail=" + Cemail + ", Cmobno=" + Cmobno
				+ ", Cpassword=" + Cpassword + "]";
	}
	
	
	
}