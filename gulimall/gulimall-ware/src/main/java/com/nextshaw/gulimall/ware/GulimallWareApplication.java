package com.nextshaw.gulimall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Program: renren-fast
 * @Description: 存储系统主类
 * @Author: ShawYoung
 * @Create: 2020-04-28 21:51
 * @Version: 1.0.0
 **/
@MapperScan("com.nextshaw.gulimall.ware.dao")
@SpringBootApplication
public class GulimallWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallWareApplication.class, args);
    }
}
