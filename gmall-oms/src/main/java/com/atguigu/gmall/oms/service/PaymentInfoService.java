package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.oms.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 19:45:04
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

