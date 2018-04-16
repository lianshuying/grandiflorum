package com.ulo.registcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistCenterApplication.class, args);
	}
}
