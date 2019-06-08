package com.lzt.demo.springboot.service;

import com.lzt.demo.springboot.dao.UserRepositoryImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl {
//    @Resource
//    private UserRepository userRepository;
    @Resource
    private UserRepositoryImpl userRepositoryImpl;

    public Object getUser() {
        Map<String, Object> map = new HashMap<>();
        map.put("primary",userRepositoryImpl.findName("soso"));
        map.put("secondary",userRepositoryImpl.findName2("admin"));
        return map;
    }
}
