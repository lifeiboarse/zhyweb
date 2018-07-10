package com.binzhou.zhy.controller;

import com.binzhou.zhy.entity.Category;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-07-05 15:28
 **/
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    ICategoryService categoryService;

    @RequestMapping(value = "/getCategoryById", produces = "application/json;charset=utf-8", method = {RequestMethod.GET})
    @ResponseBody
    public Result<Category> getOrderById(@PathVariable Long id){
        return categoryService.getOrderById(id);
    }

    @RequestMapping(value = "/all", produces = "application/json;charset=utf-8", method = {RequestMethod.GET})
    @ResponseBody
    public Result<List<Category>> selectListByOption(Category record){
        return categoryService.selectListByOption(record);
    }
}
