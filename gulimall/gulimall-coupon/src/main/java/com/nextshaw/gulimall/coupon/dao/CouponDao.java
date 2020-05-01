package com.nextshaw.gulimall.coupon.dao;

import com.nextshaw.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 *
 * @author shaw
 * @email shaw@gmail.com
 * @date 2020-04-27 22:20:50
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {

}
