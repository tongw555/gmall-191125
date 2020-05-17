package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.SpuDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 16:41:31
 */
public interface SpuDescService extends IService<SpuDescEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

