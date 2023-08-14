package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name="portfolioId")
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date purchaseDate;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private int quantity;

    protected Security() {

    }

    // security constructor
    public Security(Portfolio portfolio, String name, String category, Date purchaseDate, double purchasePrice, int quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    // getters and setters below
    public long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
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

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}