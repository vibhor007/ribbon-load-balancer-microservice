package com.example.springeureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * 
 * @author vibhor
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientStudentServiceApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx = 	SpringApplication.run(EurekaClientStudentServiceApplication.class, args);

	}
}
