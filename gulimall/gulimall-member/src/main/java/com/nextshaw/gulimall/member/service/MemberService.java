package com.nextshaw.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nextshaw.common.utils.PageUtils;
import com.nextshaw.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author shaw
 * @email shaw@gmail.com
 * @date 2020-04-27 22:16:04
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

