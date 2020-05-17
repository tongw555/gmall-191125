package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.sms.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 15:47:28
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

