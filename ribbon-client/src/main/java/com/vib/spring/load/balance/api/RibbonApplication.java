package com.vib.spring.load.balance.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author vibhor
 *
 */
@SpringBootApplication
@RestController
//@RequestMapping("/ribbon-application")
public class RibbonApplication {

	@Value("${server.port}")
	private String port;

	@GetMapping("/port")
	public String port() {
		return "application is up on port : " + port;
	}

	@GetMapping("/")
	public String refresh() {
		return "";
	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}
}
