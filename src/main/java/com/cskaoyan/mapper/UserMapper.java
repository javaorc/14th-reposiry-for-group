package com.cskaoyan.mapper;

import com.cskaoyan.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User queryUserById(@Param("id") int id);

    User queryUserByUsername(@Param("username") String username);

    int insertUser(User user);
}
