package com.example.tpspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.entities.repository")
public class TpSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpSpringBootApplication.class, args);
    }

}
