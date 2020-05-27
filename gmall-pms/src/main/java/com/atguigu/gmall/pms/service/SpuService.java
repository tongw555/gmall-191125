package com.atguigu.gmall.pms.service;

import com.atguigu.gamll.pms.entity.SpuEntity;
import com.atguigu.gmall.pms.vo.SpuVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;


import java.util.Map;

/**
 * spu信息
 *
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 16:41:31
 */
public interface SpuService extends IService<SpuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);

    PageResultVo querySpuByCid(PageParamVo pageParamVo, Long categoryId);

    void bigSave(SpuVo spuVo);
}

