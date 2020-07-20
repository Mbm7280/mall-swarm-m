package com.mall.search.service;

import com.mall.search.domain.EsProduct;
import com.mall.search.domain.EsProductRelatedInfo;
import io.swagger.models.auth.In;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 搜索商品 Service
 */
public interface EsProductService {

    /**
     * 将数据库数据全部导入ES
     * @return
     */
    int importAll();

    /**
     * 根据ID删除产品
     * @param id
     */
    void delete(Long id);

    /**
     * 根据ID创建商品
     * @param id
     * @return
     */
    EsProduct create(Long id);

    /**
     * 批量删除产品
     * @param ids
     */
    void delete(List<Long> ids);

    /**
     * 根据关键字搜索名称或则副标题
     * @param keyword
     * @param pageNum
     * @param pageSize
     * @return
     */
    Page<EsProduct> search(String keyword, In pageNum,Integer pageSize);

    /**
     * 根据关键字搜索名称或者副标题符合查询
     * @param keyword
     * @param brandId
     * @param productCategoryId
     * @param pageNum
     * @param pageSize
     * @return
     */
    Page<EsProduct> search(String keyword,Long brandId,Long productCategoryId,Integer pageNum,Integer pageSize);

    /**
     * 根据商品Id推荐相关产品
     * @param id
     * @param pageNum
     * @param pageSize
     * @return
     */
    Page<EsProduct> recommand(Long id,Integer pageNum,Integer pageSize);

    /**
     * 获取搜索词相关品牌、分类、属性
     * @param keyword
     * @return
     */
    EsProductRelatedInfo searchRelatedInfo(String keyword);

}
