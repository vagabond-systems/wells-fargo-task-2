package com.wellsfargo.counselor;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Portfolio {

    @Id
    @GeneratedValue()

    @Column(nullable = false)
    private long Portfolioid;

    @Column(nullable = false)
    private String Product_name;

    @Column(nullable = false)
    private long Clientid;

    protected Portfolio() {

    }

    public Portfolio(long Portfolioid, String Product_name, long Clientid) {
        this.Portfolioid = Portfolioid;
        this.Product_name = Product_name;
        this.Clientid = Clientid;
    }
    public long getPortfolioid() {
        return Portfolioid;
    }

    public void setPortfolioid(String Portfolioid) {
        this.Portfolioid = Long.parseLong(Portfolioid);
    }

    public String Product_name() {
        return Product_name;
    }

    public void setProduct_name(String product_name) {
        this.Product_name = Product_name;
    }

    public long getClientid() {
        return Clientid;
    }

    public void setClientid(String Clientid) {
        this.Clientid = Long.parseLong(Clientid);
    }

}
