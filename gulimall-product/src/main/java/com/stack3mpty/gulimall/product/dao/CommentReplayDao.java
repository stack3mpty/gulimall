package com.stack3mpty.gulimall.product.dao;

import com.stack3mpty.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author stack3mpty
 * @email stackmpty@gmail.com
 * @date 2024-02-09 11:50:34
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
