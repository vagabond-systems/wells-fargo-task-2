package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "financial_advisor_id")
    private FinancialAdvisor financialAdvisor;

    @OneToMany(mappedBy = "client")
    private List<Portfolio> portfolios;

}
