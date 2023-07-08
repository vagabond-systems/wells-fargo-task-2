package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long clientId;
	
	
	@ManyToOne
	@JoinColumn(name = "ad_id", referencedColumnName = "advisorId")
	private Advisor ad_id;
	
	
	 @Column(nullable = false)
	 private String firstName;

	 @Column(nullable = false)
     private String lastName;

     @Column(nullable = false)
	  private String address;

     @Column(nullable = false)
     private String phone;

     @Column(nullable = false)
     private String email;

	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public Advisor getAd_id() {
		return ad_id;
	}

	public void setAd_id(Advisor ad_id) {
		this.ad_id = ad_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Client(long clientId, Advisor ad_id, String firstName, String lastName, String address, String phone,
			String email) {
		super();
		this.clientId = clientId;
		this.ad_id = ad_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public Client() {
		super();
		
	}
	
	

}
