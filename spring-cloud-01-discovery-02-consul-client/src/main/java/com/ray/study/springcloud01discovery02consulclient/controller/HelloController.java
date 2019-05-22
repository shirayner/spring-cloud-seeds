package com.ray.study.springcloud01discovery02consulclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description
 *
 * @author shira 2019/05/20 19:57
 */
@RestController
public class HelloController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@Value("${server.port}")
	private String port;


	@GetMapping("/")
	public List<String>  listServices(){
		List<String> services = discoveryClient.getServices();
		return services;
	}

	@GetMapping("/hello")
	public String sayHello(){
		return "the service on prot:"+port+" says hello!";
	}
}
