package com.binzhou.zhy.service;

import com.binzhou.zhy.entity.Category;
import com.binzhou.zhy.model.result.Result;

import java.util.List;

public interface ICategoryService {

    public Result<Category> getOrderById(Long id);

    public Result<List<Category>> selectListByOption(Category order);

    public int insert(Category record);
}
