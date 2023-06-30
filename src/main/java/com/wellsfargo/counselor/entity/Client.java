package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @ManyToOne()
    private Advisor advisor;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "advisor")
    private List<Portfolio> portfolios;





    public Client(){

    }

    public Client(long clientId, String firstName, String lastName, String address, String phone, String email, Advisor advisor) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;

    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
