package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 19:45:05
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
