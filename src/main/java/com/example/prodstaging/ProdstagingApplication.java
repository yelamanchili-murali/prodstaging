package com.example.prodstaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProdstagingApplication {

    public static void main(String[] args) {
        System.getenv().forEach((k, v) -> System.out.println(k + " : " + v));
        SpringApplication.run(ProdstagingApplication.class, args);
    }

}
