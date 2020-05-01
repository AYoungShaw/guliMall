package com.nextshaw.gulimall.order.dao;

import com.nextshaw.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author shaw
 * @email shaw@gmail.com
 * @date 2020-04-27 22:17:32
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
