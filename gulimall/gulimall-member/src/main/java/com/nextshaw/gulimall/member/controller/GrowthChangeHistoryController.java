package com.nextshaw.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.nextshaw.gulimall.member.entity.MemberEntity;
import com.nextshaw.gulimall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nextshaw.gulimall.member.entity.GrowthChangeHistoryEntity;
import com.nextshaw.gulimall.member.service.GrowthChangeHistoryService;
import com.nextshaw.common.utils.PageUtils;
import com.nextshaw.common.utils.R;


/**
 * 成长值变化历史记录
 *
 * @author shaw
 * @email shaw@gmail.com
 * @date 2020-04-27 23:02:58
 */
@RestController
@RequestMapping("member/growthchangehistory")
public class GrowthChangeHistoryController {
    @Autowired
    private GrowthChangeHistoryService growthChangeHistoryService;

    // 测试feign客户端
    @Autowired
    CouponFeignService couponFeignService;

    @RequestMapping("/coupon")
    public R test() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("张三");
        R memeberList = couponFeignService.memeberList();

        return R.ok().put("member", memberEntity).put("coupon", memeberList.get("coupon"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = growthChangeHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        GrowthChangeHistoryEntity growthChangeHistory = growthChangeHistoryService.getById(id);

        return R.ok().put("growthChangeHistory", growthChangeHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GrowthChangeHistoryEntity growthChangeHistory) {
        growthChangeHistoryService.save(growthChangeHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GrowthChangeHistoryEntity growthChangeHistory) {
        growthChangeHistoryService.updateById(growthChangeHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        growthChangeHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
