package com.morax.service.impl;

import com.morax.dao.UserDao;
import com.morax.pojo.User;
import com.morax.service.UserService;

import java.util.Map;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public void signUp(Map<String, String> map) {
        String username = map.get("username"); // 获取用户名
        String password = map.get("password"); // 获取用户密码

        userDao.createUser(username,password);

    }
}
