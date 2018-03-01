package org.mybatis.domain;

import lombok.Data;

@Data
public class User {
    private Integer userid;

    private String name;

    private UserDetail userDetail;
}