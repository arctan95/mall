package com.classpark.small.coupon.service;

import com.classpark.small.coupon.entity.SkuLadderEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.classpark.small.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 22:20:49
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

