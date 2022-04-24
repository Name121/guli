package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author zhangyuanming
 * @email sunlightcs@gmail.com
 * @date 2022-04-19 23:56:49
 */
public interface CategoryService extends IService<CategoryEntity> {

    List<CategoryEntity> listWithTree();

    PageUtils queryPage(Map<String, Object> params);
}

