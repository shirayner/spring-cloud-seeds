package com.ray.study.springcloud04consumerhystrixfeign.service.impl;

import com.ray.study.springcloud04consumerhystrixfeign.dto.User;
import com.ray.study.springcloud04consumerhystrixfeign.service.UserService;
import org.springframework.stereotype.Component;

/**
 * UserService 的降级 Fallback 类
 *
 * @author shira 2019/05/27 19:04
 */
@Component
public class UserServiceFallback implements UserService {


	/**
	 * 出错则调用该方法，返回友好错误
	 * @param id
	 * @return
	 */
	@Override
	public String getUser1(Long id) {
		return "The user dose not exist in this system, please confirm user's id:"+id;
	}

	/**
	 * 出错则调用该方法，返回友好错误
	 * @return
	 */
	@Override
	public String getUser2(String name, String token) {
		return "The user dose not exist in this system, please confirm user's name";
	}

	/**
	 * 出错则调用该方法，返回友好错误
	 * @return
	 */
	@Override
	public User getUser3(User user) {
		return null;
	}

}
