package com.nextshaw.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nextshaw.common.utils.PageUtils;
import com.nextshaw.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author shaw
 * @email shaw@gmail.com
 * @date 2020-04-27 22:19:00
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

