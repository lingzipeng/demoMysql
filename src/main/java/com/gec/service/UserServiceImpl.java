package com.gec.service;

import com.gec.entity.User;
import com.gec.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        //查询对应表中所有数据
        return userMapper.selectList(null);
    }
}
