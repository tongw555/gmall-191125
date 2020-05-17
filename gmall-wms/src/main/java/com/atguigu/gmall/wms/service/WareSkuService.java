package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.wms.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 20:01:42
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

