package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Financialadvisor {

    @Id
    @GeneratedValue()
    private long advisor_id;

    @Column(nullable = false)
    private String Name;

    protected Financialadvisor() {

    }

    public Financialadvisor(long advisor_id, String Name) {
        this.advisor_id = advisor_id;
        this.Name = Name;
    }

    public Long getAdvisor_id() {
        return advisor_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}

