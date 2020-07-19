package com.mall.common.api;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 分页
 */
@Data
public class CommonPage<T> {

    /** 当前页数  */
    private Integer pageNum;
    /** 每页的条数 */
    private Integer pageSize;
    /** 总页数 */
    private Integer totalPage;
    /** 总条数 */
    private Long total;
    /** LIST */
    private List<T> list;

    /**
     * 将 PAGEHELPER  分页后的List转为分页信息
     * @param list
     * @param <T>
     * @return
     */
    public static <T> CommonPage<T> restPage(List<T> list){
        CommonPage<T> result = new CommonPage<T>();
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return  result;
    }

    /**
     * 将SPRINGDATA 分页后的list转换为分页信息
     * @param pageInfo
     * @param <T>
     * @return
     */
    public static <T> CommonPage<T> restPage(Page<T> pageInfo){
        CommonPage<T> result = new CommonPage<>();
        result.setTotal(pageInfo.getTotalElements());
        result.setTotalPage(pageInfo.getTotalPages());
        result.setPageSize(pageInfo.getSize());
        result.setPageNum(pageInfo.getNumber());
        result.setList(pageInfo.getContent());
        return result;
    }
}
