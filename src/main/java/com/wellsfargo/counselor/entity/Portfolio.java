package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long advisorId;

    @Column(nullable = false)
    private Long clientId;

    public Portfolio() { }

    public Portfolio(String name, Long advisorId, Long clientId) {
        this.name = name;
        this.advisorId = advisorId;
        this.clientId = clientId;
    }

    public Long getPortfolioId() { return portfolioId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Long getAdvisorId() { return advisorId; }
    public void setAdvisorId(Long advisorId) { this.advisorId = advisorId; }
    public Long getClientId() { return clientId; }
    public void setClientId(Long clientId) { this.clientId = clientId; }
}
