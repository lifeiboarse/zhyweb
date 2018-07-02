package com.binzhou.zhy.controller;


import com.binzhou.zhy.common.util.JsonUtils;
import com.binzhou.zhy.model.dto.basic.GoodsDTO;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    IGoodsService goodsService;

    @RequestMapping(value = "/query", method = {RequestMethod.GET})
    public String queryGoodsById(@RequestParam("id") Long id) {
        Result<GoodsDTO> orderResult = goodsService.selectByPrimaryKey(id);
        String result = JsonUtils.objectToJson(orderResult);
        return result;
    }


    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    public String queryGoodsListByParam(GoodsDTO goods) {
        Result<List<GoodsDTO>> result1 = goodsService.selectListByOption(null);
        String result = JsonUtils.objectToJson(result1);
        return result;
    }

    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    @ResponseBody
    public Result save(@RequestBody GoodsDTO goods) {
        return goodsService.insert(goods);
    }

    @RequestMapping(value = "/saveSelective", method = {RequestMethod.POST})
    @ResponseBody
    public Result saveSelective(@RequestBody GoodsDTO goods) {
        return goodsService.insertSelective(goods);
    }

    @RequestMapping(value = "/update", method = {RequestMethod.POST})
    @ResponseBody
    public Result update(@RequestBody GoodsDTO goods) {
        return goodsService.updateByPrimaryKey(goods);
    }

    @RequestMapping(value = "/updateSelective", method = {RequestMethod.POST})
    @ResponseBody
    public Result updateSelective(@RequestBody GoodsDTO goods) {
        return goodsService.updateByPrimaryKeySelective(goods);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Result delete(@RequestParam(value = "id", defaultValue = "0") Long id) {
        return goodsService.deleteByPrimaryKey(id);
    }


}
