package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.sms.entity.SkuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 15:47:28
 */
public interface SkuBoundsService extends IService<SkuBoundsEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

