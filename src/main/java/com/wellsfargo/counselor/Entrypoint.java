package com.wellsfargo.counselor;

import com.wellsfargo.counselor.entity.Advisor;
import com.wellsfargo.counselor.entity.Client;
import com.wellsfargo.counselor.entity.Portfolio;
import com.wellsfargo.counselor.entity.Security;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Entrypoint {

    public static void main(String[] args) {
        SpringApplication.run(Entrypoint.class, args);

        Advisor advisor = new Advisor("John", "Doe", "123 Main St", "123-456-7890", "john.doe@example.com");

        // Create a client
        Client client = new Client("Jane", "Smith", "jane.smith@example.com", "987-654-3210", advisor);

        // Create a portfolio
        Portfolio portfolio = new Portfolio( "Client Portfolio", client);

        // Create a security
        Security security = new Security("Company A", "Stock", LocalDate.now(), new BigDecimal("100.00"), 10, portfolio);

        // Add the security to the portfolio
        portfolio.addSecurity(security);

        // Update the advisor's details
        advisor.setPhone("999-888-7777");

        // Print the advisor's and client's information
        System.out.println("Advisor: " + advisor.getFirstName() + " " + advisor.getLastName());
        System.out.println("Client: " + client.getFirstName() + " " + client.getLastName());
        System.out.println("Client's Portfolio: " + portfolio.getName());
        System.out.println("Security: " + security.getName() + " (" + security.getCategory() + ")");
    }

}



