package com.app.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.*;

@Entity
@Table(name="orders_details")
public class orders_details {
	
private Date OrderDate;
private double rate;
private Integer Qty;

@Column(name="reg_date")
@Temporal(TemporalType.DATE)
public Date getOrderDate() {
	return OrderDate;
}
public void setOrderDate(Date orderDate) {
	OrderDate = orderDate;
}

public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public Integer getQty() {
	return Qty;
}
public void setQty(Integer qty) {
	Qty = qty;
}
public orders_details(Date orderDate, double rate, Integer qty) {
	super();
	OrderDate = orderDate;
	this.rate = rate;
	Qty = qty;
}
@Override
public String toString() {
	return "OrderDetails [OrderDate=" + OrderDate + ", rate=" + rate + ", Qty=" + Qty + "]";
}


}
