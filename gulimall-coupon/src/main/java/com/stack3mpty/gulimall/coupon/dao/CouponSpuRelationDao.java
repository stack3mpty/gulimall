package com.stack3mpty.gulimall.coupon.dao;

import com.stack3mpty.gulimall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author stack3mpty
 * @email stackmpty@gmail.com
 * @date 2024-02-09 11:48:49
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
