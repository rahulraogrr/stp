package com.example.cre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreServiceApplication.class, args);
	}

}
