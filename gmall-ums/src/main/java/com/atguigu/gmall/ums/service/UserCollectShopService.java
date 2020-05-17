package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.ums.entity.UserCollectShopEntity;

import java.util.Map;

/**
 * 关注店铺表
 *
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 19:55:19
 */
public interface UserCollectShopService extends IService<UserCollectShopEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

