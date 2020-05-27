package com.atguigu.gmall.pms.service;

import com.atguigu.gamll.pms.entity.SpuAttrValueEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;

import java.util.List;
import java.util.Map;

/**
 * spu属性值
 *
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 16:41:31
 */
public interface SpuAttrValueService extends IService<SpuAttrValueEntity> {

    PageResultVo queryPage(PageParamVo paramVo);

    List<SpuAttrValueEntity> querySpuAttrValuesBySpuId(Long spuId);
}

