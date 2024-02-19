package com.wellsfargo.counselor;

import com.wellsfargo.counselor.entity.Advisor;
import com.wellsfargo.counselor.entity.Client;
import com.wellsfargo.counselor.entity.PortfolioID;
import com.wellsfargo.counselor.entity.SecurityID;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Entrypoint {

    public static void main(String[] args) {
        SpringApplication.run(Entrypoint.class, args);
    }


}
