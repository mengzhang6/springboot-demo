package meng.study.springboot.controller;

import meng.study.springboot.entity.User;
import meng.study.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mengzhang6 on 2017/7/21.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping(value = "/getUsers")
    public List<User> getUsers() {

        return userService.getUserList();
    }

    @ResponseBody
    @GetMapping("/findById")
    public User findById(@RequestParam("id") String id) {
        return userService.getUserById(id);
    }

    @GetMapping("/findById/{id}")
    @ResponseBody
    public User findById2(@PathVariable("id") String id) {
        return userService.getUserById(id);
    }

}
