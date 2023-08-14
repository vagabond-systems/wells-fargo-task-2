package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    public long portfolioID;
    @Column(nullable = false)
    public long balance;
    @ManyToOne
    @JoinColumn(name = "clientID")
    public Client client;

    public  Portfolio(){

    }

    public Portfolio(long balance, Client client){
        this.balance = balance;
        this.client = client;
    }

    public long getPortfolioID(){
        return portfolioID;
    }
    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
