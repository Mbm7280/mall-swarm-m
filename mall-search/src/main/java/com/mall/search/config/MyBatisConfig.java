package com.mall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis 配置类
 */
@Configuration
@MapperScan({"com.mall.search.dao"})
public class MyBatisConfig {


}
