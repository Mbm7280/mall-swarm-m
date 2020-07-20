package com.mall.search.domain;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * 搜索中商品的属性信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class EsProductAttributeValue implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Long productAttributeId;

    @Field(type = FieldType.Keyword)
    private String value;
    private Integer type;

    @Field(type = FieldType.Keyword)
    private String name;

}
