package com.classpark.small.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.classpark.small.common.utils.PageUtils;
import com.classpark.small.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 09:45:59
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);
}

