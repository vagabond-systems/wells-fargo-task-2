package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;

@Entity
public class PortfolioID {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;


    protected PortfolioID() {
        // Default constructor for JPA
    }

    public PortfolioID(Client client) {
        this.client = client;
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
}
