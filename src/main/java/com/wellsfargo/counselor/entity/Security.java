package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

public class Security {
    @Id
    @GeneratedValue
    public long securityID;
    @Column(nullable = false)
    public String firstName;
    @Column(nullable = false)
    public String lastName;
    @Column(nullable = false)
    public String securityCategory;
    @Column(nullable = false)
    public String purchaseDate;
    @Column(nullable = false)
    public long purchasePrice;
    @Column(nullable = false)
    public long purchaseQuantity;

    @ManyToOne
    @JoinColumn(name = "portfolioID")
    public Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "advisorId")
    public Advisor advisor;

    public Security(){

    }

    public Security(String firstName, String lastName, String securityCategory, String purchaseDate, long purchasePrice, long purchaseQuantity, Portfolio portfolio, Advisor advisor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.securityCategory = securityCategory;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.purchaseQuantity = purchaseQuantity;
        this.portfolio = portfolio;
        this.advisor = advisor;
    }

    public long getSecurityID() {
        return securityID;
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

    public String getSecurityCategory() {
        return securityCategory;
    }

    public void setSecurityCategory(String securityCategory) {
        this.securityCategory = securityCategory;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public long getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(long purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}