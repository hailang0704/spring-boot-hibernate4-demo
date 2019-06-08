package com.lzt.demo.springboot.controller;

import com.lzt.demo.springboot.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RequestMapping("/user")
@Controller
public class UserController {
    @Resource
    private UserServiceImpl userService;

    @RequestMapping(name="/get_user", method = { RequestMethod.GET,
            RequestMethod.POST })
    @ResponseBody
    public Object getUser(){
        return userService.getUser();
    }
}
