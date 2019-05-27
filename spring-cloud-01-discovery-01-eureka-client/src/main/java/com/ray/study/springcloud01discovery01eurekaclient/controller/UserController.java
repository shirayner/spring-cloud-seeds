package com.ray.study.springcloud01discovery01eurekaclient.controller;

import com.ray.study.springcloud01discovery01eurekaclient.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * description
 *
 * @author shira 2019/05/27 10:38
 */
@RestController
@RequestMapping("/user")
public class UserController {

	/**
	 * get 路径请求参数传递
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public String getUser1(@PathVariable("id") Long id) throws Exception {
		if(id == null || id <= 0){
			throw new Exception("invalid parameter: id="+ id);
		}

		return "the user's id is: "+id;
	}

	/**
	 * get 请求参数传递
	 * @param name
	 * @return
	 */
	@GetMapping("/get2")
	public String getUser2(@RequestParam String name,  @RequestHeader String token) {
		return "the user's name is: "+name +" and token is:"+ token;
	}

	/**
	 *  post 请求参数传递
	 * @param user
	 * @return
	 */
	@PostMapping("/get3")
	public User getUser3(@RequestBody User user) {
		return user;
	}



}
