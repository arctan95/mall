package com.classpark.small.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.classpark.small.common.utils.PageUtils;
import com.classpark.small.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author classpark
 * @email tanzhq1995@gmail.com
 * @date 2020-10-10 09:45:58
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);

    /**
     * @description 找到catelogId的完整路径
     * [父/子/孙]
     * @author classpark
     * @date 2020/10/29 16:54
     * @return long[]
     **/
    Long[] findCatelogPath(Long catelogId);

    void updateCascade(CategoryEntity category);

}

