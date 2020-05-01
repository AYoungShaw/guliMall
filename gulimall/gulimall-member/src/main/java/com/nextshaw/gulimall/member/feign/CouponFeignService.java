package com.nextshaw.gulimall.member.feign;

import com.nextshaw.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: renren-fast
 * @description: 远程调用coupon服务的接口
 * @author: ShawYoung
 * @create: 2020-04-29 22:54
 **/
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/memberList")
    public R memeberList();
}
