package com.app.pojos;

import java.util.List;

import javax.persistence.*;
/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
*/
@Entity
@Table(name="deliveryboy")
public class DeliveryBoy 
{
	int DBid,Vehical_no;
	String DBname,DBmobile_no;
	
	Restaurant rest;
	private Orders order;
	private Restaurant restaurant;
	
private List<Orders> orders;
	@OneToMany(mappedBy="deliveryboy",cascade=CascadeType.ALL)//mandatory 
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	@ManyToOne //mandatory --o.w hib throws MappingExc
	@JoinColumn(name="Rest_id")
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getDBid() {
		return DBid;
	}
	public void setDBid(int dBid) {
		DBid = dBid;
	}
	@Column(length=5)
	public int getVehical_no() {
		return Vehical_no;
	}
	public void setVehical_no(int vehical_no) {
		Vehical_no = vehical_no;
	}
	@Column(length=20)
	public String getDBname() {
		return DBname;
	}
	public void setDBname(String dBname) {
		DBname = dBname;
	}
	@Column(length=10)
	public String getDBmobile_no() {
		return DBmobile_no;
	}
	public void setDBmobile_no(String dBmobile_no) {
		DBmobile_no = dBmobile_no;
	}
	public DeliveryBoy(int dBid, int vehical_no, String dBname, String dBmobile_no) {
		super();
		DBid = dBid;
		Vehical_no = vehical_no;
		DBname = dBname;
		DBmobile_no = dBmobile_no;
	}
	public DeliveryBoy(int vehical_no, String dBname, String dBmobile_no) {
		super();
		Vehical_no = vehical_no;
		DBname = dBname;
		DBmobile_no = dBmobile_no;
	}
	@Override
	public String toString() {
		return "DeliveryBoy [DBid=" + DBid + ", Vehical_no=" + Vehical_no + ", DBname=" + DBname + ", DBmobile_no="
				+ DBmobile_no + "]";
	}
	
	
	
	
}