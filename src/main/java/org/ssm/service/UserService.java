package org.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.ssm.dao.UserMapper;
import org.ssm.pojo.UserDoc;

public class UserService {
    @Autowired
    private UserMapper userMapper;

    public UserDoc getUserDoc(){
        return userMapper.getUser();
    }
}
