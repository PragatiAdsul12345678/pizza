package com.app.pojos;


import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Orders {
private	Integer order_id;
private double total;
private Customer customer;
private DeliveryBoy deliveryboy;
private Cart cart;

@ManyToOne //mandatory --o.w hib throws MappingExc
@JoinColumn(name="DBid")
public DeliveryBoy getDeliveryboy() {
	return deliveryboy;
}
@OneToOne
@JoinColumn(name="cartId")
public Cart getCart() {
	return cart;
}

public void setCart(Cart cart) {
	this.cart = cart;
}

public void setDeliveryboy(DeliveryBoy deliveryboy) {
	this.deliveryboy = deliveryboy;
}

Set<Pizza> likes;

@ManyToMany(mappedBy = "detailsOrders")
public Set<Pizza> getLikes() {
	return likes;
}

public void setLikes(Set<Pizza> likes) {
	this.likes = likes;
}


@Column(length=20)
public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}


@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public Integer getOrder_id() {
	return order_id;
}

public void setOrder_id(Integer order_id) {
	this.order_id = order_id;
}

@ManyToOne //mandatory --o.w hib throws MappingExc
@JoinColumn(name="Cid")
public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

@Override
public String toString() {
	return "Orders [order_id=" + order_id + ", customer=" + customer;
}	
}

