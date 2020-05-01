package com.nextshaw.gulimall.product.dao;

import com.nextshaw.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author shaw
 * @email shaw@gmail.com
 * @date 2020-04-27 22:19:00
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
