package com.binzhou.zhy.controller;


import com.binzhou.zhy.common.util.JsonUtils;
import com.binzhou.zhy.model.dto.basic.GoodsDTO;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods/api")
public class GoodsController {

    @Autowired
    IGoodsService goodsService;

    @RequestMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8  ")
    public String get() {
        Result<GoodsDTO> orderResult = goodsService.selectByPrimaryKey(1L);
        String result = JsonUtils.objectToJson(orderResult);
        return result;
    }


    @RequestMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8  ")
    public String googsList() {
        Result<List<GoodsDTO>> result1 = goodsService.selectGoodsListByParam();
        String result = JsonUtils.objectToJson(result1);
        return result;
    }
}
