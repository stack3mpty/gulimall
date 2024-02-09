package com.stack3mpty.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stack3mpty.common.utils.PageUtils;
import com.stack3mpty.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author stack3mpty
 * @email stackmpty@gmail.com
 * @date 2024-02-09 11:50:34
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

