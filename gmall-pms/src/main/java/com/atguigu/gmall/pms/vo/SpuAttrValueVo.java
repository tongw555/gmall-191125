package com.atguigu.gmall.pms.vo;


import com.atguigu.gamll.pms.entity.SpuAttrValueEntity;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Data
public class SpuAttrValueVo extends SpuAttrValueEntity {

    //private List<String> valueSelected;

    public void setValueSelected(List<Object> valueSelected) {
        // 如果接受的集合为空，则不设置
        if (CollectionUtils.isEmpty(valueSelected)) {
            return;
        }
        this.setAttrValue(StringUtils.join(valueSelected, ","));
    }
}
