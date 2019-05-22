package com.ray.study.springcloud02consumerribbon.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * description
 *
 * @author shira 2019/05/22 17:01
 */
@RestController
@Slf4j
public class HelloRibbonController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/hello")
	public String sayHello(){
		String result = restTemplate.getForObject("http://eureka-client/hello",String.class);
		log.info(result);
		return result;
	}

}
