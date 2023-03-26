package com.classpark.small.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.classpark.small.common.utils.PageUtils;
import com.classpark.small.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 22:20:49
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

