package com.ray.study.springcloud01discovery01eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloud01Discovery01EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud01Discovery01EurekaServerApplication.class, args);
	}

}
