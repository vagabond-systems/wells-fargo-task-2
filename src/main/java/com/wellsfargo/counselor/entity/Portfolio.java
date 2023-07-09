package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;
    
    @OneToMany
    @JoinColumn(name = "clientId")
    private long clientId;

    @Column(name = "creationDate")
    @Temporal(TemporalType.DATE)
    private java.util.Date creationDate;

    public Long getPortfolioId() {
        return portfolioId;
    }

    public java.util.Date getCreationDate() {
        return creationDate;
    }
}
