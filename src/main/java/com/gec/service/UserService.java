package com.gec.service;

import com.gec.entity.User;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface UserService {
    public List<User> getAllUser();
}
