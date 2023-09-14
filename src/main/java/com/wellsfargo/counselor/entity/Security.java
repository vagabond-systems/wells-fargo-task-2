package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;
import java.util.List;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "security_id")
    private long securityId;

    @Column(name = "portfolio_id")
    @NotBlank(message = "portfolio is required")
    private long portfolioId;

    @Column(nullable = false)
    @NotBlank(message = "name is required")
    private String name;

    @Column(nullable = false)
    @NotBlank(message = "category is required")
    private String category;

    @Column(name="purchased_price", nullable = false)
    @NotBlank(message = "purchased price is required")
    private double purchasedPrice;

    @Column(nullable = false)
    @NotBlank(message = "quantity is required")
    private String quantity;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "purchased_date", updatable = false)
    private Date purchasedDate;

    @ManyToMany
    @JoinTable(
            name="portfolio_security",
            joinColumns=@JoinColumn(name="portfolio_id", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="security_id", referencedColumnName="id"))
    private List<Portfolio> portfolio;

    public Security(long portfolioId, String name, String category, double purchasedPrice, String quantity, Date purchasedDate, List<Portfolio> portfolio) {
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasedPrice = purchasedPrice;
        this.quantity = quantity;
        this.purchasedDate = purchasedDate;
        this.portfolio = portfolio;
    }


    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
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

    public double getPurchasedPrice() {
        return purchasedPrice;
    }

    public void setPurchasedPrice(double purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Date getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(Date purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public List<Portfolio> getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(List<Portfolio> portfolio) {
        this.portfolio = portfolio;
    }

    public long getSecurityId() {
        return securityId;
    }
}
