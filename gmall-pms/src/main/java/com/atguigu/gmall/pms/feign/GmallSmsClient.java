package com.atguigu.gmall.pms.feign;

import com.atguigu.gmall.common.bean.ResponseVo;
import com.atguigu.gmall.pms.feign.fallback.GmallSmsClietFallBack;
import com.atguigu.gmall.sms.api.GmallSmsApi;
import com.atguigu.gmall.sms.vo.SkuSaleVo;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(value = "sms-service",fallback = GmallSmsClietFallBack.class)
public interface GmallSmsClient extends GmallSmsApi {
//    @PostMapping("sms/skubounds/sku/sales")
//    public ResponseVo<Object> saveSkuSales(@RequestBody SkuSaleVo skuSaleVo);

}
