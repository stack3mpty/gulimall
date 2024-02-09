package com.stack3mpty.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stack3mpty.common.utils.PageUtils;
import com.stack3mpty.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author stack3mpty
 * @email stackmpty@gmail.com
 * @date 2024-02-09 11:48:49
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

