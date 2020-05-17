package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.CommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author tongwei
 * @email tw18721781186@163.com
 * @date 2020-05-17 16:41:32
 */
public interface CommentService extends IService<CommentEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

