package com.wellsfargo.counselor.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Portfolios {

	@Id
	@GeneratedValue
	private int portfolio_id;
	@Column
	private String portfolio_name;
	@Column
	private String portfolio_type;
	@OneToMany
	private Securities security;
	public String getPortfolio_name() {
		return portfolio_name;
	}
	public void setPortfolio_name(String portfolio_name) {
		this.portfolio_name = portfolio_name;
	}
	public String getPortfolio_type() {
		return portfolio_type;
	}
	public void setPortfolio_type(String portfolio_type) {
		this.portfolio_type = portfolio_type;
	}
	public Securities getSecurity() {
		return security;
	}
	public void setSecurity(Securities security) {
		this.security = security;
	}
	
}
