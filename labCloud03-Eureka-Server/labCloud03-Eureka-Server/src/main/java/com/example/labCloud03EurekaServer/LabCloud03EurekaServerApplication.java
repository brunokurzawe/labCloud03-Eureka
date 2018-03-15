package com.example.labCloud03EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LabCloud03EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabCloud03EurekaServerApplication.class, args);
	}
}
