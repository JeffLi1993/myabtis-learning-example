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
 * @description User Role 与 User_Role 表 关联聚集
 */
@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    /**
     * curl http://localhost:8889/user/detail 查看结果
     * @return
     */
    @GetMapping(value = "/user/detail")
    public List<User> getUserWithDetail() {
        return userService.getUserWithDetail();
    }
}
