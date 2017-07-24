package meng.study.springboot.service;

import meng.study.springboot.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by mengzhang6 on 2017/7/21.
 */
public interface UserService {

    List<User> getUserList();

    User getUserById(String id);
}
