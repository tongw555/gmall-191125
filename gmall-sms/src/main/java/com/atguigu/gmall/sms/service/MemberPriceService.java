package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.sms.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 15:47:28
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

