package com.wellsfargo.counselor.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence. Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    protected Portfolio() {

    }

    public Portfolio(String name) {
        this.name = name;
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
}
