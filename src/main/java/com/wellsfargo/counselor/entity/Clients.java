package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Clients {

	@Id
	@GeneratedValue
	private int client_id;
	@Column
	private String client_name;
	@Column
	private String client_address;
	@Column
	private int portfolio_id;
	
	@OneToMany
	private Portfolios portfolio;


	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public String getClient_address() {
		return client_address;
	}

	public void setClient_address(String client_address) {
		this.client_address = client_address;
	}

	public int getPortfolio_id() {
		return portfolio_id;
	}

	public void setPortfolio_id(int portfolio_id) {
		this.portfolio_id = portfolio_id;
	}

	public Portfolios getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolios portfolio) {
		this.portfolio = portfolio;
	}
	
}
