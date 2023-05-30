package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;


    private String name;
    private List<Security> securities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;


    protected Portfolio() {
        this.securities = new ArrayList<>();
    }

    public Portfolio(String name, Client client) {

        this.name = name;
        this.client = client;
        this.securities = new ArrayList<>();

    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addSecurity(Security security) {
        securities.add(security);
    }
}




