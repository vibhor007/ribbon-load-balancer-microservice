package com.vib.example.springeureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientSchoolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientSchoolServiceApplication.class, args);
	}
}
