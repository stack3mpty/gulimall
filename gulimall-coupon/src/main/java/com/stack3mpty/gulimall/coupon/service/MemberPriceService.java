package com.stack3mpty.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stack3mpty.common.utils.PageUtils;
import com.stack3mpty.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author stack3mpty
 * @email stackmpty@gmail.com
 * @date 2024-02-09 11:48:50
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

