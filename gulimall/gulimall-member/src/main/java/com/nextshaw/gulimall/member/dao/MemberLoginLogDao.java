package com.nextshaw.gulimall.member.dao;

import com.nextshaw.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 *
 * @author shaw
 * @email shaw@gmail.com
 * @date 2020-04-27 22:16:04
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {

}
