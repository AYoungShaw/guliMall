package com.nextshaw.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.nextshaw.gulimall.product.entity.BrandEntity;
import com.nextshaw.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setName("华为1");
        // brandEntity.setLogo("科技就是力量");
        // brandEntity.setDescript("拥有华为");
        // brandEntity.setShowStatus(1);
        // brandEntity.setFirstLetter("h");
        // brandEntity.setSort(0);

        // brandService.save(brandEntity);
        // System.out.println("保存成功");
        // brandService.updateById(brandEntity);
        // System.out.println("更改成功");
        // 查询操作
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item) -> {
            System.out.println(item);
        });
    }

}
