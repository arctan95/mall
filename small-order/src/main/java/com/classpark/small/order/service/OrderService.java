package com.classpark.small.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.classpark.small.common.utils.PageUtils;
import com.classpark.small.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 22:52:41
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

