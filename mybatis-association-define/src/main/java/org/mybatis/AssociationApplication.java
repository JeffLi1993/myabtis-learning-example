package org.mybatis;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Aaron Yang (yb)
 * @modified Aaron 4:37 PM 2/5/2018
 * @email aaron19940628@gmail.com 
 * @date 4:37 PM 2/5/2018.
 * @description mybatis-association-define startup
 * @version 1.0
 */
@SpringBootApplication
@MapperScan("org.mybatis.dao")
public class AssociationApplication {

    private static final Log LOGGER = LogFactory.get();

    public static void main(String[] args) {
        SpringApplication.run(AssociationApplication.class,args);
        LOGGER.info("Mybatis-Association-Define-Application Start Success");
    }
}
