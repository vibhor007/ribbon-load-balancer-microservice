package com.vib.spring.load.balance.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/**
 * 
 * @author vibhor
 *
 */
@SpringBootApplication
@RestController
@RibbonClient(name = "ribbon-client", configuration = RibbonConfiguration.class)
public class UserAppApplication {
	
	
	@Autowired
	private RestTemplate template;

	@GetMapping("/invoke")
	public String invokeExample() {
		return template.getForObject("http://ribbon-client/port" , String.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(UserAppApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate template() {
		return new RestTemplate();
	}
}
