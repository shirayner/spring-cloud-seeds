package com.ray.study.springcloud01discovery01eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloud01Discovery01EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud01Discovery01EurekaClientApplication.class, args);
	}

}
