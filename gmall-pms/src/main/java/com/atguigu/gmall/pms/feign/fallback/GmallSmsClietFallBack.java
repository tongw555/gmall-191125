package com.atguigu.gmall.pms.feign.fallback;

import com.atguigu.gmall.common.bean.ResponseVo;
import com.atguigu.gmall.pms.feign.GmallSmsClient;
import com.atguigu.gmall.sms.vo.SkuSaleVo;
import org.springframework.stereotype.Component;

@Component
public class GmallSmsClietFallBack implements GmallSmsClient {
    @Override
    public ResponseVo<Object> saveSkuSales(SkuSaleVo skuSaleVo) {
        return ResponseVo.fail("保存营销信息失败");
    }
}
