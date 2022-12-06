package com.ceps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CepsApplication.class, args);
	}

}
