package com.nextshaw.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nextshaw.common.utils.PageUtils;
import com.nextshaw.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author shaw
 * @email shaw@gmail.com
 * @date 2020-04-27 22:22:28
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

