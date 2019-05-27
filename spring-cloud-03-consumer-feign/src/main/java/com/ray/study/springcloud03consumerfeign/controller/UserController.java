package com.ray.study.springcloud03consumerfeign.controller;

import com.ray.study.springcloud03consumerfeign.dto.User;
import com.ray.study.springcloud03consumerfeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * description
 *
 * @author shira 2019/05/27 10:38
 */
@RestController
@RequestMapping("/user")
public class UserController {


	@Autowired
	UserService userService;

	/**
	 * get 路径请求参数传递
	 */
	@GetMapping("/get")
	public String getUser1(){
		return userService.getUser1(10001L);
	}

	/**
	 * get 请求参数传递
	 * @return
	 */
	@GetMapping("/get2")
	public String getUser2() {
		return userService.getUser2("张三", "271267312jhdsjfhdsjf3uwyruwe");
	}

	/**
	 *  post 请求参数传递
	 * @return
	 */
	@PostMapping("/get3")
	public User getUser3() {

		User user1 =  new User();
		user1.setId(10001L);
		user1.setName("张三");
		user1.setAge(22);
		user1.setCreationDate(new Date());

		return userService.getUser3(user1);

	}

}
