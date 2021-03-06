package com.atguigu.gamll.pms.api;

import com.atguigu.gamll.pms.entity.*;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.common.bean.ResponseVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public interface GmallPmsApi {
    /**
     * 分页查询spu
     * @param paramVo
     * @return
     */
    @PostMapping("pms/spu/page")
    public ResponseVo<List<SpuEntity>> querySpuPage(@RequestBody PageParamVo paramVo);

    /**
     * 根据spuId查询sku
     * @param spuId
     * @return
     */
    @GetMapping("pms/sku/spu/{spuId}")
    public ResponseVo<List<SkuEntity>> querySkusBySpuId(@PathVariable("spuId")Long spuId);

    /**
     * 根据品牌id查询品牌
     * @param id
     * @return
     */
    @GetMapping("pms/brand/{id}")
    public ResponseVo<BrandEntity> queryBrandById(@PathVariable("id") Long id);

    /**
     * 根据分类id查询分类
     * @param id
     * @return
     */
    @GetMapping("pms/category/{id}")
    public ResponseVo<CategoryEntity> queryCategoryById(@PathVariable("id") Long id);

    /**
     * 根据skuId查询搜索类型的销售属性及值
     * @param skuId
     * @return
     */
    @GetMapping("pms/skuattrvalue/sku/{skuId}")
    public ResponseVo<List<SkuAttrValueEntity>> querySkuAttrValuesBySkuId(@PathVariable("skuId")Long skuId);

    /**
     * 根据spuId查询搜索类型的基本属性及值
     * @param spuId
     * @return
     */
    @GetMapping("pms/spuattrvalue/spu/{spuId}")
    public ResponseVo<List<SpuAttrValueEntity>> querySpuAttrValuesBySpuId(@PathVariable("spuId")Long spuId);
}
