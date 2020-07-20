package com.mall.search.dao;

import com.mall.search.domain.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品搜索自定义DAO
 */
public interface EsProductDao {

    /**
     * 查询所有商品
     * @param id
     * @return
     */
    List<EsProduct> getAllEsProductList(@Param("id") Long id);

}
