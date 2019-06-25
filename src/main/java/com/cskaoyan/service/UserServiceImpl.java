package com.cskaoyan.service;

import com.cskaoyan.bean.User;
import com.cskaoyan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by little Stone
 * Date 2019/6/24 Time 14:49
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public User queryUserById(int id) {
		User user = userMapper.queryUserById(id);
		return user;
	}

	@Override
	public User queryUserByUsername(String username) {
		User user = userMapper.queryUserByUsername(username);
		return user;
	}

	@Override
	public int insertUser(User user) {
		return userMapper.insertUser(user);
	}
}
