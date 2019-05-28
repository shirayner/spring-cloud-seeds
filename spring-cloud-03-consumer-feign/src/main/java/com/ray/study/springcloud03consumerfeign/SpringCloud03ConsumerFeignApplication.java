package com.ray.study.springcloud03consumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloud03ConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud03ConsumerFeignApplication.class, args);
	}

}
