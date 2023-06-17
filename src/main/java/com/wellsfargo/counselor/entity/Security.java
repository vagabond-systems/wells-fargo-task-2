package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

import java.util.Date;

public class Security {

    @jakarta.persistence.Id
    @GeneratedValue()
    @Column(nullable = false)
    private long Id;

    @Column(nullable = false)
    private String Category;

    @Column(nullable = false)
    private String Purchase_date;

    @Column(nullable = false)
    private long Purchase_price;

    @Column(nullable = false)
    private long Quantity;

    @Column(nullable = false)
    private long Portfolio_id;
    protected Security() {

    }

    public Security(long Id, String Category, Date Purchase_date, long Purchase_price, long Quantity, long Portfolio_id) {
        this.Id = Id;
        this.Category = Category;
        this.Purchase_date = String.valueOf(Purchase_date);
        this.Purchase_price = Purchase_price;
        this.Quantity = Quantity;
        this.Portfolio_id = Portfolio_id;
    }
    public long getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Long.parseLong(Id);
    }

    public String Category() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getPurchase_date() {
        return Purchase_date;
    }

    public void setPurchase_date(String Purchase_date) {
        this.Purchase_date = Purchase_date;
    }

    public long getPurchase_price() {
        return Purchase_price;
    }

    public void setPurchase_price(String Purchase_price) {
        this.Purchase_price = Long.parseLong(Purchase_price);
    }

    public long getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Long.parseLong(Quantity);
    }

    public long getPortfolio_id() {
        return Portfolio_id;
    }

    public void setPortfolio_id(String Portfolio_id) {
        this.Portfolio_id = Long.parseLong(Portfolio_id);
    }

}
