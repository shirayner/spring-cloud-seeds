package com.ray.study.springcloud03consumerfeign.service;

import com.ray.study.springcloud03consumerfeign.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * description
 *
 * @author shira 2019/05/27 11:10
 */
@FeignClient(name = "eureka-client",path = "/user")
public interface UserService {

	@GetMapping("/{id}")
	String getUser1(@PathVariable("id") Long id);

	@GetMapping("/get2")
	String getUser2(@RequestParam("name") String name,  @RequestHeader("token") String token);

	@PostMapping("/get3")
	User getUser3(@RequestBody  User user);

}
