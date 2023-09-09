package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioID;

    @Column(nullable = false)
    private LocalDate creationDate;

    @ManyToOne
    @JoinColumn(name= "clientId")
    private Client clientId;

    public Portfolio(LocalDate creationDate, Client clientId) {
        this.creationDate = creationDate;
        this.clientId = clientId;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }
}
