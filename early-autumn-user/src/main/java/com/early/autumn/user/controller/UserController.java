package com.early.autumn.user.controller;

import com.early.autumn.domain.user.User;
import com.early.autumn.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userService.queryUserById(id);
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
