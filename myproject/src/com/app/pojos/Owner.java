package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="owner")
public class Owner 
{
	private Integer Owner_id;
	String Owner_name,Owmer_password;
	
	
	private Restaurant restaurant;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	public Integer getOwner_id() {
		return Owner_id;
	}
	public void setOwner_id(Integer owner_id) {
		Owner_id = owner_id;
	}
	@Column(length=25)
	public String getOwner_name() {
		return Owner_name;
	}
	public void setOwner_name(String owner_name) {
		Owner_name = owner_name;
	}
	@Column(length=25)
	public String getOwmer_password() {
		return Owmer_password;
	}
	public void setOwmer_password(String owmer_password) {
		Owmer_password = owmer_password;
	}
	
	
	
	@OneToOne(mappedBy="owner")
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public Owner(Integer owner_id, String owner_name, String owmer_password) {
		super();
		Owner_id = owner_id;
		Owner_name = owner_name;
		Owmer_password = owmer_password;
	}
	@Override
	public String toString() {
		return "Owner [Owner_id=" + Owner_id + ", Owner_name=" + Owner_name + ", Owmer_password=" + Owmer_password
				+ "]";
	}
	
}
