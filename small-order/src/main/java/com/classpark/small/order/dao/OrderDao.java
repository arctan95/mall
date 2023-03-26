package com.classpark.small.order.dao;

import com.classpark.small.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 22:52:41
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
