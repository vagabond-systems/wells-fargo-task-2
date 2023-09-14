package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private long clientId;
    @Column(name="advisor_id",nullable = false)
    @NotBlank(message = "advisor is required")
    private long advisorId;
    @Column(name="first_name",nullable = false)
    @NotBlank(message = "first name is required")
    private String firstName;

    @Column(name="last_name",nullable = false)
    @NotBlank(message = "last name is required")
    private String lastName;
    @Column(nullable = false)
    @NotBlank(message = "address is required")
    private String address;
    @Column(nullable = false)
    @NotBlank(message = "phone is required")
    private String phone;
    @Column(nullable = false)
    @NotBlank(message = "phone is required")
    private String email;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;

    public long getClientId() {
        return clientId;
    }

    public long getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(long advisorId) {
        this.advisorId = advisorId;
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

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public Client(long advisorId, String firstName, String lastName, String address, String phone, String email, Advisor advisor) {
        this.advisorId = advisorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.advisor = advisor;
    }
}
