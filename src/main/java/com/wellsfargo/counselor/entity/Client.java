package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue
    public long clientID;

    @Column(nullable = false)
    public String firstName;
    @Column(nullable = false)
    public String lastName;
    @Column(nullable = false)
    public long contactNo;
    @ManyToOne
    @JoinColumn(name = "advisorId")
    public Advisor advisor;


    public  Client(){

    }

    public Client(String firstName, String lastName, long contactNo, Advisor advisor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
        this.advisor = advisor;
    }

    public long getClientID(){
        return clientID;
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

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}