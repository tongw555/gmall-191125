package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 16:41:32
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

