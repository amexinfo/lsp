package com.danmaicrosevice.service.rigistery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRigisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRigisteryApplication.class, args);
	}

}
