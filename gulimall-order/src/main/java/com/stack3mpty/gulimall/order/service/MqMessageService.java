package com.stack3mpty.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stack3mpty.common.utils.PageUtils;
import com.stack3mpty.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author stack3mpty
 * @email stackmpty@gmail.com
 * @date 2024-02-09 12:03:17
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

