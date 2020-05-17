package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.oms.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 19:45:05
 */
public interface OrderService extends IService<OrderEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

