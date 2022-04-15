package com.example.department.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenUIConfig {

	@Bean
	public OpenAPI customOpenApi() {
		return new OpenAPI().info(new Info().title("Department Service").version("1.0.0").description("Department Service API").termsOfService("Terms And Conditions")
				.contact(new Contact().name("Rahul Rao Gonda").url("https://github.com/rahulraogrr").email("rahulrao.grr@gmail.com")));
	}

}
