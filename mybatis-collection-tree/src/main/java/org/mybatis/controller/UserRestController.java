package org.mybatis.controller;

import org.mybatis.domain.User;
import org.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Aaron Yang (yb)
 * @version 1.0
 * @modified Aaron 1/31/2018 9:39 AM
 * @email aaron19940628@gmail.com
 * @date 1/31/2018 9:39 AM.
 * @description User Role User_Role 表 关联聚集
 */
@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public List<User> getNodeTree() {
        return userService.getUserDetail();
    }
}