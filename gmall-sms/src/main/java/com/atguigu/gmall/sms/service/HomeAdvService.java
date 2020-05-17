package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.sms.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 15:47:28
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

