package com.ray.study.springcloud01discovery01eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

	@GetMapping("/")
	public List<String>  listServices(){
		List<String> services = discoveryClient.getServices();
		return services;
	}
}
