package com.cskaoyan.service;

import com.cskaoyan.bean.User;

/**
 * Created by little Stone
 * Date 2019/6/24 Time 14:46
 */
public interface UserService {

	User queryUserById(int id);
	User queryUserByUsername( String username);

	int insertUser(User user);
}
