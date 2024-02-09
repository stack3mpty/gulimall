package com.stack3mpty.gulimall.member.dao;

import com.stack3mpty.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author stack3mpty
 * @email stackmpty@gmail.com
 * @date 2024-02-09 11:57:23
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
