package com.stack3mpty.gulimall.order.dao;

import com.stack3mpty.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author stack3mpty
 * @email stackmpty@gmail.com
 * @date 2024-02-09 12:03:17
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
