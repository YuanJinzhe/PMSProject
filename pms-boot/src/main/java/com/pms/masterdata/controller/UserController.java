package com.pms.masterdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pms.masterdata.service.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    public String queryUserList() {
        return null;
    }
}
