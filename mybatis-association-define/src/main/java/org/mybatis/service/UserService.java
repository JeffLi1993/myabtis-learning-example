package org.mybatis.service;

import org.mybatis.domain.User;

import java.util.List;

/**
 * @author Aaron Yang (yb)
 * @version 1.0
 * @modified Aaron 1/31/2018 9:37 AM
 * @email aaron19940628@gmail.com
 * @date 1/31/2018 9:37 AM.
 * @description
 */
public interface UserService {

    /**
     * get user's basic info with detail info
     *
     * @return
     */
    List<User> getUserWithDetail();
}
