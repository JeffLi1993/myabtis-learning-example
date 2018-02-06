package org.mybatis.dao;

import org.mybatis.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Aaron Yang (yb)
 * @version 1.0
 * @modified Aaron 1/31/2018 9:32 AM
 * @email aaron19940628@gmail.com
 * @date 1/31/2018 9:32 AM.
 * @description
 */
@Component
public interface UserDao {

    List<User> getUserWithDetail();



}
