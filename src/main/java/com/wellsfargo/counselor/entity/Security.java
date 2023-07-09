package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class Security {
    @Id
    @GeneratedValue()
    private long securityId;
    
    @OneToMany
    @JoinColumn(name = "portfolioId")
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Float purchasePrice;

    @Column(name = "purchaseDate")
    @Temporal(TemporalType.DATE)
    private java.util.Date purchaseDate;

    @Column(name = "quantity")
    private Long quantity;

    public Security(String name, String category, Float purchasePrice, Long quantity) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
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

    public Float getPurchasePrice() {
        return purchasePrice;
    }

    public void setCategory(Float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public java.util.Date getPurchaseDate() {
        return purchaseDate;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
