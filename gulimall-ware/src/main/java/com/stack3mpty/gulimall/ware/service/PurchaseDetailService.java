package com.stack3mpty.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stack3mpty.common.utils.PageUtils;
import com.stack3mpty.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author stack3mpty
 * @email stackmpty@gmail.com
 * @date 2024-02-09 12:10:21
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

