package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Security {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long securityId;
	
	@ManyToOne
	@JoinColumn(name = "port_Id", referencedColumnName = "portfolioId")
	private Portfolio port_Id;
	
	 @Column(nullable = false)
	 private String name;

	 @Column(nullable = false)
     private String category;
	 
	 @Column(nullable = false)
	 private int purchasePrice;

	 @Column(nullable = false)
     private int purchaseDate;
	 
	 @Column(nullable = false)
	 private String quantity;

	public long getSecurityId() {
		return securityId;
	}

	public void setSecurityId(long securityId) {
		this.securityId = securityId;
	}

	public Portfolio getPort_Id() {
		return port_Id;
	}

	public void setPort_Id(Portfolio port_Id) {
		this.port_Id = port_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public int getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(int purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Security(long securityId, Portfolio port_Id, String name, String category, int purchasePrice,
			int purchaseDate, String quantity) {
		super();
		this.securityId = securityId;
		this.port_Id = port_Id;
		this.name = name;
		this.category = category;
		this.purchasePrice = purchasePrice;
		this.purchaseDate = purchaseDate;
		this.quantity = quantity;
	}

	public Security() {
		super();
		}

	

}
