package meng.study.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mengzhang6 on 2017/7/21.
 */
@Controller
@RequestMapping(value = "/")
public class HelloController {
    @ResponseBody
    @GetMapping(value = "/hello")
    public String hello(){return "hello world";}

}
