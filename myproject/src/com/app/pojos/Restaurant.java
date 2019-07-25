package com.app.pojos;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="restaurant")
public class Restaurant {
	
	private Integer Rest_id;
	private String Rname,Address;
	
	
	private List<DeliveryBoy> deliveryBoy;
	
	
	private Owner owner;
	
	//private List<DeliveryBoy> DeliveryBoy =new ArrayList<>();

	@OneToMany(mappedBy="restaurant",cascade=CascadeType.ALL)//mandatory 
	public List<DeliveryBoy> getDeliveryBoy() {
		return deliveryBoy;
	}
	
	public void setDeliveryBoy(List<DeliveryBoy> deliveryBoy) {
		this.deliveryBoy = deliveryBoy;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getRest_id()
	{
		return Rest_id;
	}
	public void setRest_id(Integer rest_id) {
		Rest_id = rest_id;
	}
	
	@Column(length=20)
	public String getRname() {
		return Rname;
	}
	public void setRname(String rname) {
		Rname = rname;
	}
	@Column(length=20)
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Restaurant(Integer rest_id, String rname, String address) {
		super();
		Rest_id = rest_id;
	
		Rname = rname;
		Address = address;
	}

	
	@OneToOne
	@JoinColumn(name="Owner_id")
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Restaurant [Rest_id=" + Rest_id + ", Rname=" + Rname + ", Address=" + Address + ", DeliveryBoy="
				+ deliveryBoy + ", owner=" + owner + "]";
	}
	
	
	
	
}
