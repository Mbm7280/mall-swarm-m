package com.mall.search.service.impl;

import com.mall.search.dao.EsProductDao;
import com.mall.search.domain.EsProduct;
import com.mall.search.domain.EsProductRelatedInfo;
import com.mall.search.repository.EsProductRepository;
import com.mall.search.service.EsProductService;
import io.swagger.models.auth.In;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 搜索商品 ServiceImpl
 * TODO 补全实现类
 */
@Service
public class EsProductServiceImpl implements EsProductService {

    private static final Logger logger = LoggerFactory.getLogger(EsProductServiceImpl.class);

    @Autowired
    private EsProductDao productDao;

    @Autowired
    private EsProductRepository esProductRepository;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public int importAll() {
        return 0;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public EsProduct create(Long id) {
        return null;
    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public Page<EsProduct> search(String keyword, In pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public Page<EsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public Page<EsProduct> recommand(Long id, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public EsProductRelatedInfo searchRelatedInfo(String keyword) {
        return null;
    }
}
