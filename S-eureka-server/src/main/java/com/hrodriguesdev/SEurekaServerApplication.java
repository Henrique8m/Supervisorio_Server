package com.hrodriguesdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SEurekaServerApplication.class, args);
	}

}
