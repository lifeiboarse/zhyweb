package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.Category;
import com.binzhou.zhy.entity.Order;
import com.binzhou.zhy.mapper.CategoryMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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

    public Category selectByPrimaryKey(Long id) {
        Category order = categoryMapper.selectByPrimaryKey(id);
        return order;
    }

    public List<Category> selectListByOption(Category order) {
        List<Category> orderList = categoryMapper.selectListByOption(order);
        return orderList;
    }

    public int insertSelective(Category record) {
        return categoryMapper.insertSelective(record);
    }
}
