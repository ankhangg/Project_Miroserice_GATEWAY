package com.ankhang.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ProjectMicroserviceGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMicroserviceGateWayApplication.class, args);
	}

}
