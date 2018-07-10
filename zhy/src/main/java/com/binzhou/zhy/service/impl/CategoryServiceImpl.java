package com.binzhou.zhy.service.impl;

import com.binzhou.zhy.dao.CategoryDao;
import com.binzhou.zhy.entity.Category;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-07-05 15:24
 **/

@Service("categoryService")
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public Result<Category> getOrderById(Long id) {
        Result<Category> result=new Result<Category>();
        Category orderById = categoryDao.selectByPrimaryKey(id);
        result.setData(orderById);
        return result;
    }

    @Override
    public Result<List<Category>> selectListByOption(Category order) {
        Result<List<Category>> result=new Result<List<Category>>();
        List<Category> categories = categoryDao.selectListByOption(order);
        result.setData(categories);
        return result;
    }

    @Override
    public int insert(Category record) {
        return 0;
    }
}
