package meng.study.springboot.service.impl;

import meng.study.springboot.dao.UserMapper;
import meng.study.springboot.entity.User;
import meng.study.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mengzhang6 on 2017/7/21.
 */
@Service
public class UserImplMysqlService implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public User getUserById(String id) {
        return userMapper.getUserById(id);
    }
}
