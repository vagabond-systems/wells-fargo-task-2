package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne()
    private PortFolio portFolio;

    private String name;
    private String Category;
    private int price;
    private LocalDateTime purchasedDate;
    private int quantity;

    protected Security(){}

    public Security(Long id, PortFolio portFolio, String name, String category, int price, LocalDateTime purchasedDate, int quantity) {
        this.id = id;
        this.portFolio = portFolio;
        this.name = name;
        Category = category;
        this.price = price;
        this.purchasedDate = purchasedDate;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PortFolio getPortFolio() {
        return portFolio;
    }

    public void setPortFolio(PortFolio portFolio) {
        this.portFolio = portFolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(LocalDateTime purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
