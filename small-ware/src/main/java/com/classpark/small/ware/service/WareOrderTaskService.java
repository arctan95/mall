package com.classpark.small.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.classpark.small.common.utils.PageUtils;
import com.classpark.small.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-11 15:34:42
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

