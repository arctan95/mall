package com.classpark.small.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.classpark.small.common.utils.PageUtils;
import com.classpark.small.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 09:45:58
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void up(Long spuId);
}

