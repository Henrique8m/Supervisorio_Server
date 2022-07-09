package com.hrodriguesdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SUserApplication.class, args);
	}

}
