package com.wellsfargo.counselor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.wellsfargo.counselor.entity.Portfolio;
import com.wellsfargo.counselor.entity.Advisor;
import com.wellsfargo.counselor.entity.Client ;
import com.wellsfargo.counselor.entity.Security;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Entrypoint {

    public static void main(String[] args) {
        SpringApplication.run(Entrypoint.class, args);
    }

}
