package com.nextshaw.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nextshaw.common.utils.PageUtils;
import com.nextshaw.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author shaw
 * @email shaw@gmail.com
 * @date 2020-04-27 22:20:50
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

