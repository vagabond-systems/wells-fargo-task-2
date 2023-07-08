package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long portfolioId;
	
	@ManyToOne
	@JoinColumn(name = "cl_Id", referencedColumnName = "clientId")
	private Client cl_Id;
	
	@Column(nullable = false)
	private int creationDate;

	public long getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(long portfolioId) {
		this.portfolioId = portfolioId;
	}

	public Client getCl_Id() {
		return cl_Id;
	}

	public void setCl_Id(Client cl_Id) {
		this.cl_Id = cl_Id;
	}

	public int getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(int creationDate) {
		this.creationDate = creationDate;
	}

	public Portfolio(long portfolioId, Client cl_Id, int creationDate) {
		super();
		this.portfolioId = portfolioId;
		this.cl_Id = cl_Id;
		this.creationDate = creationDate;
	}

	public Portfolio() {
		super();
		}
	
	

}
