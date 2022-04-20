package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhangyuanming
 * @email sunlightcs@gmail.com
 * @date 2022-04-20 22:24:26
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
