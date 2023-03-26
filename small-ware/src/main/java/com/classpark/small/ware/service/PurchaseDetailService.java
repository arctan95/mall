package com.classpark.small.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.classpark.small.common.utils.PageUtils;
import com.classpark.small.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-11 15:34:43
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

