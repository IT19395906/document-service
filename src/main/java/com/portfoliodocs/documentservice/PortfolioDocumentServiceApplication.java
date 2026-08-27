package com.portfoliodocs.documentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class PortfolioDocumentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioDocumentServiceApplication.class, args);
	}

}
