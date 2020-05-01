package com.nextshaw.gulimall.coupon.dao;

import com.nextshaw.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 *
 * @author shaw
 * @email shaw@gmail.com
 * @date 2020-04-27 22:20:50
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {

}
