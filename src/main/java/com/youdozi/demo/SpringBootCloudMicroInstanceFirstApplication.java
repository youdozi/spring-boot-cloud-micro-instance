package com.youdozi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootCloudMicroInstanceFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudMicroInstanceFirstApplication.class, args);
	}

}
