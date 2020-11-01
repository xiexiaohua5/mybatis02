package com.qf.hua.mybatis.service.impl;

import com.qf.hua.mybatis.mapper.UserMapper;
import com.qf.hua.mybatis.service.UserService;

import javax.annotation.Resource;

public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public int removeUser(int userId) {
        int i = userMapper.deleteUser(userId);
        return i;
    }
}
