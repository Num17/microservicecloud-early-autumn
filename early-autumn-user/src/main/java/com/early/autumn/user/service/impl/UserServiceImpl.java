package com.early.autumn.user.service.impl;

import com.early.autumn.common.domain.user.User;
import com.early.autumn.user.dao.earlyautumn.UserMapper;
import com.early.autumn.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public User queryUserById(long id) {
        return userMapper.findUserById(id);
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
