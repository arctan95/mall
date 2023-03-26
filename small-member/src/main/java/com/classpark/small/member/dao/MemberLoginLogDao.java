package com.classpark.small.member.dao;

import com.classpark.small.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 22:34:31
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {

}
