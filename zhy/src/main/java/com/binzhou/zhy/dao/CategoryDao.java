package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.Category;
import com.binzhou.zhy.mapper.CategoryMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 服务dao
 *
 * @author lifeifei
 * @create 2018-06-19 20:58
 **/

@Component
public class CategoryDao {

    @Autowired
    CategoryMapper categoryMapper;

    public Category selectByPrimaryKey(@Param("id") Long id) {
        return categoryMapper.selectByPrimaryKey(id);
    }
}
