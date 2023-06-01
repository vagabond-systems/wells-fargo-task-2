package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String date;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;


    protected Portfolio() {

    }

    public Portfolio(String date, Client client) {
        this.date = date;
        this.client = client;
    }

    public Long getPortfolioId() { return portfolioId; }

    public String getDate() { return date; }

    public Client getClient() { return client; }

    public void setClient(Client client) { this.client = client; }
}
