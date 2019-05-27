package com.ray.study.springcloud04consumerhystrixfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SpringCloud04ConsumerHystrixFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud04ConsumerHystrixFeignApplication.class, args);
	}

}
