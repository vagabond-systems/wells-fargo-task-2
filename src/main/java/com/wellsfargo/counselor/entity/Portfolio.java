package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<PortfolioSecurity> securities;

    public Portfolio() {}

    public Portfolio(Client client, List<PortfolioSecurity> securities) {
        this.client = client;
        this.securities = securities;
    }

    public long getPortfolioId() { return portfolioId; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public List<PortfolioSecurity> getSecurities() { return securities; }
    public void setSecurities(List<PortfolioSecurity> securities) { this.securities = securities; }
}
