package com.atguigu.gmall.pms.mapper;

import com.atguigu.gamll.pms.entity.SpuAttrValueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * spu属性值
 * 
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 16:41:31
 */
@Mapper
public interface SpuAttrValueMapper extends BaseMapper<SpuAttrValueEntity> {

    List<SpuAttrValueEntity> querySpuAttrValuesBySpuId(Long spuId);
}
