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
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private String portfolioName;
    private String portfolioType;
    private BigDecimal totalValue;
    private LocalDate creationDate;
    private String status;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Portfolio() {
    }
}