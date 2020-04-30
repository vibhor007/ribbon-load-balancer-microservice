package com.vib.example.springeureka.client.util;

import java.util.Collections;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
/**
 * 
 * @author vibhor
 *
 */
@Component
public class EurekaClientStudentServiceInfoContributor implements InfoContributor {

	@Override
	public void contribute(Info.Builder builder) {
		builder.withDetail("details",
				Collections.singletonMap("description", "This is the Student service, which is discovery server aware, and this service will be Called by school Microservice, fro student details, which is again dicovery server aware!!! "));
	}

}
