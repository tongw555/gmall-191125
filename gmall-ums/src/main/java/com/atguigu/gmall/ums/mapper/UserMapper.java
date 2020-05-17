package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 19:55:19
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
