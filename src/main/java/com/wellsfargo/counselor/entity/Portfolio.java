package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String portfolioAssets;

    @Column(nullable = false)
    private double portfolioValue;

    @Column(nullable = false)
    private double portfolioGrowth;

    @Column(nullable = false)
    private int numberOfSecurities;

    @Column(nullable = false)
    private String creationDate;

    @OneToOne(mappedBy = "portfolio")
    private Client client;

    protected Portfolio() {

    }

    public Portfolio(String portfolioAssets, double portfolioValue, double portfolioGrowth, int numberOfSecurities, Client client, String creationDate) {
        this.portfolioAssets = portfolioAssets;
        this.portfolioValue = portfolioValue;
        this.portfolioGrowth = portfolioGrowth;
        this.numberOfSecurities = numberOfSecurities;
        this.client = client;
        this.creationDate = creationDate;
    }


    public long getPortfolioId() {
        return portfolioId;
    }

    public String getPortfolioAssets() {
        return portfolioAssets;
    }

    public void setPortfolioAssets(String portfolioAssets) {
        this.portfolioAssets = portfolioAssets;
    }

    public double getPortfolioValue() {
        return portfolioValue;
    }

    public void setPortfolioValue(double portfolioValue) {
        this.portfolioValue = portfolioValue;
    }

    public double getPortfolioGrowth() {
        return portfolioGrowth;
    }

    public void setPortfolioGrowth(double portfolioGrowth) {
        this.portfolioGrowth = portfolioGrowth;
    }

    public int getNumberOfSecurities() {
        return numberOfSecurities;
    }

    public void setNumberOfSecurities(int numberOfSecurities) {
        this.numberOfSecurities = numberOfSecurities;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}