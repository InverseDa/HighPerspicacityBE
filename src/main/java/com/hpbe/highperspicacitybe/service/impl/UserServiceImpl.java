package com.hpbe.highperspicacitybe.service.impl;

import com.hpbe.highperspicacitybe.mapper.UserMapper;
import com.hpbe.highperspicacitybe.model.User;
import com.hpbe.highperspicacitybe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }
}
