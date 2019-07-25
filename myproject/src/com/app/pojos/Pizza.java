package com.app.pojos;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="pizza")
public class Pizza {
	private Integer Pizza_id;
	private float rate;
	private String Pizza_name;
	
	private List<CartItem> cartItemList;
	
	@OneToMany(mappedBy = "pizza",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	public List<CartItem> getCartItemList() {
		return cartItemList;
	}

	public void setCartItemList(List<CartItem> cartItemList) {
		this.cartItemList = cartItemList;
	}

	Set<Orders> detailsOrders;
	
	 @ManyToMany
	 @JoinTable(
			   name = "Orders_Details", 
			   joinColumns = @JoinColumn(name = "Pizza_id"), 
			   inverseJoinColumns = @JoinColumn(name = "order_id"))
	    public Set<Orders> getDetailsOrders() {
		return detailsOrders;
	}

	public void setDetailsOrders(Set<Orders> detailsOrders) {
		this.detailsOrders = detailsOrders;
	}

public Pizza() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getPizza_id() {
		return Pizza_id;
	}
	
	public void setPizza_id(Integer pizza_id) {
		Pizza_id = pizza_id;
	}
	
	@Column(length=10)
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	@Column(length=10)
	public String getPizza_name() {
		return Pizza_name;
	}
	public void setPizza_name(String pizza_name) {
		Pizza_name = pizza_name;
	}
	public Pizza(Integer pizza_id,float rate, String pizza_name) {
		super();
		Pizza_id = pizza_id;
		
		this.rate = rate;
		Pizza_name = pizza_name;
	}

	@Override
	public String toString() {
		return "Pizza [Pizza_id=" + Pizza_id + ", rate=" + rate + ", Pizza_name=" + Pizza_name;
	}
	
	
}
