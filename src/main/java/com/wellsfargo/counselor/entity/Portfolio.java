package com.wellsfargo.investment.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "portfolios")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "portfolio_id")
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id", unique = true, nullable = false)
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<Security> securities;

    // Standard empty constructor required by JPA
    public Portfolio() {}

    // Main constructor required by task instructions
    public Portfolio(Client client, List<Security> securities) {
        this.client = client;
        this.securities = securities;
    }

    // Getters and Setters
    public Long getPortfolioId() { return portfolioId; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public List<Security> getSecurities() { return securities; }
    public void setSecurities(List<Security> securities) { this.securities = securities; }
}