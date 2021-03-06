package br.com.emmanuelneri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TripsAppConfig {

    public static void main(String[] args) {
        SpringApplication.run(TripsAppConfig.class, args);
    }

}