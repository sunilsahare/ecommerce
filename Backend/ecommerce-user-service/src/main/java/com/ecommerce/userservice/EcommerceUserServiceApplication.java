package com.ecommerce.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EcommerceUserServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(EcommerceUserServiceApplication.class, args);
	}





}
