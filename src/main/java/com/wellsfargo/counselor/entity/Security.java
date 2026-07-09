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
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private SecurityCategory category;

    private String tickerSymbol;
    private String securityName;
    private String assetType;
    private String marketExchange;

    private BigDecimal currentMarketPrice;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Security() {
    }

    public Security(SecurityCategory category,
                    String tickerSymbol,
                    String securityName,
                    String assetType,
                    String marketExchange,
                    BigDecimal currentMarketPrice,
                    Timestamp createdAt,
                    Timestamp updatedAt) {

        this.category = category;
        this.tickerSymbol = tickerSymbol;
        this.securityName = securityName;
        this.assetType = assetType;
        this.marketExchange = marketExchange;
        this.currentMarketPrice = currentMarketPrice;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public SecurityCategory getCategory() {
        return category;
    }

    public void setCategory(SecurityCategory category) {
        this.category = category;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getMarketExchange() {
        return marketExchange;
    }

    public void setMarketExchange(String marketExchange) {
        this.marketExchange = marketExchange;
    }

    public BigDecimal getCurrentMarketPrice() {
        return currentMarketPrice;
    }

    public void setCurrentMarketPrice(BigDecimal currentMarketPrice) {
        this.currentMarketPrice = currentMarketPrice;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}