package com.mall.search.repository;

import com.mall.search.domain.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 商品操作Es
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct,Long> {

    /**
     * 搜索查询
     * @param name
     * @param subTitle
     * @param keywords
     * @param page
     * @return
     */
    Page<EsProduct> findByNameOrBySubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);

}
