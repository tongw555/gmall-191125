package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.ums.entity.IntegrationHistoryEntity;

import java.util.Map;

/**
 * 购物积分记录表
 *
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 19:55:20
 */
public interface IntegrationHistoryService extends IService<IntegrationHistoryEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

