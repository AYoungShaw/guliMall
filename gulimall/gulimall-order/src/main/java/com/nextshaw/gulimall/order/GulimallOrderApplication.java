package com.nextshaw.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Program: renren-fast
 * @Description: 订单服务主类
 * @Author: ShawYoung
 * @Create: 2020-04-28 21:44
 * @Version: 1.0.0
 **/
@MapperScan("com.nextshaw.gulimall.order.dao")
@SpringBootApplication
public class GulimallOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallOrderApplication.class, args);
    }
}
