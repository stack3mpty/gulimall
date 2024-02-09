package com.stack3mpty.gulimall.product.dao;

import com.stack3mpty.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author stack3mpty
 * @email stackmpty@gmail.com
 * @date 2024-02-09 11:50:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
