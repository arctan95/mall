package com.classpark.small.coupon.service;

import com.classpark.small.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.classpark.small.common.utils.PageUtils;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 22:20:49
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

