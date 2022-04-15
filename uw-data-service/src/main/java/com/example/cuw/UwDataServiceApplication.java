package com.example.cuw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UwDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UwDataServiceApplication.class, args);
	}

}