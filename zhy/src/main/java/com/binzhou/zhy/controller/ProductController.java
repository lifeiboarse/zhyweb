package com.binzhou.zhy.controller;


import com.binzhou.zhy.common.util.JsonUtils;
import com.binzhou.zhy.model.dto.basic.ProductDTO;
import com.binzhou.zhy.model.dto.page.ProductPageDTO;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    IProductService productService;

    @RequestMapping(value = "/detail",produces = "application/json;charset=utf-8",  method = {RequestMethod.GET})
    public String queryGoodsById(@RequestParam("id") Long id) {
        Result<ProductPageDTO> orderResult = productService.selectByPrimaryKey(id);
        String result = JsonUtils.objectToJson(orderResult);
        return result;
    }


    @RequestMapping(value = "/list",produces = "application/json;charset=utf-8",  method = {RequestMethod.GET})
    public String queryGoodsListByParam(ProductDTO goods) {
        Result<List<ProductDTO>> result1 = productService.selectListByOption(null);
        String result = JsonUtils.objectToJson(result1);
        return result;
    }

    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    @ResponseBody
    public Result save(@RequestBody ProductDTO goods) {
        return productService.insert(goods);
    }

    @RequestMapping(value = "/saveSelective", method = {RequestMethod.POST})
    @ResponseBody
    public Result saveSelective(@RequestBody ProductDTO goods) {
        return productService.insertSelective(goods);
    }

    @RequestMapping(value = "/update", method = {RequestMethod.POST})
    @ResponseBody
    public Result update(@RequestBody ProductDTO goods) {
        return productService.updateByPrimaryKey(goods);
    }

    @RequestMapping(value = "/updateSelective", method = {RequestMethod.POST})
    @ResponseBody
    public Result updateSelective(@RequestBody ProductDTO goods) {
        return productService.updateByPrimaryKeySelective(goods);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Result delete(@RequestParam(value = "id", defaultValue = "0") Long id) {
        return productService.deleteByPrimaryKey(id);
    }


}
