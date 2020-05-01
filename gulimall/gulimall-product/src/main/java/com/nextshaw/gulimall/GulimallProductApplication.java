package com.nextshaw.gulimall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Program: renren-fast
 * @Description: product主类
 * @Author: ShawYoung
 * @Create: 2020-04-28 21:06
 * @Version: 1.0.0
 **/
@MapperScan("com.nextshaw.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }
}
