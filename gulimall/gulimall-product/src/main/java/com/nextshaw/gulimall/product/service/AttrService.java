package com.nextshaw.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nextshaw.common.utils.PageUtils;
import com.nextshaw.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author shaw
 * @email shaw@gmail.com
 * @date 2020-04-27 22:19:00
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

