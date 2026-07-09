package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Timestamp;

@Entity
public class PortfolioHolding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long holdingId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "security_id")
    private Security security;

    private BigDecimal quantity;
    private BigDecimal averagePurchasePrice;

    private LocalDate purchaseDate;
    private BigDecimal currentValue;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    public PortfolioHolding() {
    }
}