package com.classpark.small.coupon.service;

import com.classpark.small.coupon.entity.SpuBoundsEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.classpark.small.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 22:20:49
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

