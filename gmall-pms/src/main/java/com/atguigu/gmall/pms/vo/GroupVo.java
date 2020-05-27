package com.atguigu.gmall.pms.vo;

import com.atguigu.gamll.pms.entity.AttrEntity;
import com.atguigu.gamll.pms.entity.AttrGroupEntity;
import lombok.Data;

import java.util.List;

@Data
public class GroupVo extends AttrGroupEntity {

    private List<AttrEntity> attrEntities;
}
