package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Security {

        @Id
        @GeneratedValue()
        private long securityId;

        @Column(nullable = false)
        private Date creationDate;

        @Column(nullable = false)
        private String name;

        @Column(nullable = false)
        private String category;

        @Column(nullable = false)
        private String purchasePrice;

        @Column(nullable = false)
        private Date purchaseDate;

        @Column(nullable = false)
        private Long quantity;

        @ManyToOne
        @JoinColumn(name = "portfolio_id", nullable = false)
        private Portfolio portfolio;

        protected Security() {

        }

        public Security(Date creationDate, String name, String category, String purchasePrice, Date purchaseDate, Long quantity, Portfolio portfolio) {
            this.creationDate = creationDate;
            this.name = name;
            this.category = category;
            this.purchasePrice = purchasePrice;
            this.purchaseDate = purchaseDate;
            this.quantity = quantity;
            this.portfolio = portfolio;
        }

        public Long getSecurityId() {
            return securityId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getPurchasePrice() {
            return purchasePrice;
        }

        public void setPurchasePrice(String purchasePrice) {
            this.purchasePrice = purchasePrice;
        }

        public Date getPurchaseDate() {
            return purchaseDate;
        }

        public void setPurchaseDate(Date purchaseDate) {
            this.purchaseDate = purchaseDate;
        }

        public Long getQuantity() {
            return quantity;
        }

        public void setQuantity(Long quantity) {
            this.quantity = quantity;
        }

        public Portfolio getPortfolio() {
            return portfolio;
        }

        public void setPortfolio(Portfolio portfolio) {
            this.portfolio = portfolio;
        }


        public Date getCreationDate() {
            return creationDate;
        }

        public void setCreationDate(Date creationDate) {
            this.creationDate = creationDate;
        }


    }
