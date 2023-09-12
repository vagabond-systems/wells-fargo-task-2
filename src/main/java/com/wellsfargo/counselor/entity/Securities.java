package com.wellsfargo.counselor.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Securities {

	
	@Id
	@GeneratedValue
	private int security_Id;
	@Column
	private String security_name;
	@Column
	private Date security_purchase_date;
	@Column
	private int security_purchase_qty;
	@Column
	private double security_purchase_price;
	@Column
	private String security_purchase_category;
	public String getSecurity_name() {
		return security_name;
	}
	public void setSecurity_name(String security_name) {
		this.security_name = security_name;
	}
	public Date getSecurity_purchase_date() {
		return security_purchase_date;
	}
	public void setSecurity_purchase_date(Date security_purchase_date) {
		this.security_purchase_date = security_purchase_date;
	}
	public int getSecurity_purchase_qty() {
		return security_purchase_qty;
	}
	public void setSecurity_purchase_qty(int security_purchase_qty) {
		this.security_purchase_qty = security_purchase_qty;
	}
	public double getSecurity_purchase_price() {
		return security_purchase_price;
	}
	public void setSecurity_purchase_price(double security_purchase_price) {
		this.security_purchase_price = security_purchase_price;
	}
	public String getSecurity_purchase_category() {
		return security_purchase_category;
	}
	public void setSecurity_purchase_category(String security_purchase_category) {
		this.security_purchase_category = security_purchase_category;
	}
	
	
}
