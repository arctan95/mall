package com.classpark.small.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.classpark.small.common.utils.PageUtils;
import com.classpark.small.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 09:45:58
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

