package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @ManyToOne
    @JoinColumn(name = "holding_id")
    private PortfolioHolding holding;

    private String transactionType;
    private Timestamp transactionDate;
    private BigDecimal quantity;
    private BigDecimal price;
    private BigDecimal totalAmount;
    private Timestamp createdAt;

    public Transaction() {
    }
}