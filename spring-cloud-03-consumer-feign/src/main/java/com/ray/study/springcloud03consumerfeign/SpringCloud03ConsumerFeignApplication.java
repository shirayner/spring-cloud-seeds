package com.ray.study.springcloud03consumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SpringCloud03ConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud03ConsumerFeignApplication.class, args);
	}

}
