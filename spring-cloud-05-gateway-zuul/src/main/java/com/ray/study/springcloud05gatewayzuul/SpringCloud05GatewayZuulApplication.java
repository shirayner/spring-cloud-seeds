package com.ray.study.springcloud05gatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class SpringCloud05GatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud05GatewayZuulApplication.class, args);
	}

}
