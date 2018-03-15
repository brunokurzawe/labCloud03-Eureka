package com.example.labCloud03EurekaDisciplinaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LabCloud03EurekaDisciplinaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabCloud03EurekaDisciplinaClientApplication.class, args);
	}
}
