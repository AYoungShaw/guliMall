package com.nextshaw.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Program: renren-fast
 * @Description: 优惠券主类
 * @Author: ShawYoung
 * @Create: 2020-04-28 21:34
 * @Version: 1.0.0
 **/
@MapperScan("com.nextshaw.gulimall.coupon.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }
}
