package com.nextshaw.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nextshaw.common.utils.PageUtils;
import com.nextshaw.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author shaw
 * @email shaw@gmail.com
 * @date 2020-04-27 22:17:32
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

