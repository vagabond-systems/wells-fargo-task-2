package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    public Portfolio() {}

    public Portfolio(List<Security> securities) {
        this.securities = securities;
    }

    public Long getPortfolioId() { return portfolioId; }

    public List<Security> getSecurities() {
            return securities;
        }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
