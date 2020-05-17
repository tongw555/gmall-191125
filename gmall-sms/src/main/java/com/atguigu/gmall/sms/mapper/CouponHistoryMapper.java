package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 15:47:28
 */
@Mapper
public interface CouponHistoryMapper extends BaseMapper<CouponHistoryEntity> {
	
}
