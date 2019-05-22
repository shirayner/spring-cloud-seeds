package com.ray.study.springcloud02consumerribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloud02ConsumerRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud02ConsumerRibbonApplication.class, args);
	}

}
