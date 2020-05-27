package com.atguigu.gmall.search.repositoy;

import com.atguigu.gmall.search.bean.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface GoodsRepository extends ElasticsearchRepository<Goods, Long> {
}
