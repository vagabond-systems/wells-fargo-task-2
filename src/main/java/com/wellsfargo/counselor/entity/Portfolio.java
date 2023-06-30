package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @CreatedDate
    private Date creationDate;

    @ManyToOne
    private Client client;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "portfolio")
    private List<Security> securityList;

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Portfolio(long portfolioId, Date creationDate) {
        this.portfolioId = portfolioId;
        this.creationDate = creationDate;
    }
}
