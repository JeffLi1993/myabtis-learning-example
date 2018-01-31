package org.mybatis.service.impl;

import org.mybatis.dao.UserDao;
import org.mybatis.domain.User;
import org.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Aaron Yang (yb)
 * @version 1.0
 * @modified Aaron 1/31/2018 9:38 AM
 * @email aaron19940628@gmail.com
 * @date 1/31/2018 9:38 AM.
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserDetail() {
        return userDao.getUserDetail();
    }
}
