package com.classpark.small.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.classpark.small.common.utils.PageUtils;
import com.classpark.small.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 22:34:31
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

