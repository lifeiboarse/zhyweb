package com.binzhou.zhy.controller;

import com.binzhou.zhy.common.util.JsonUtils;
import com.binzhou.zhy.model.dto.basic.OrderDTO;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order/api")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8  ")
    public String get() {
        Result<OrderDTO> orderResult = orderService.getOrderById(1L);
        String result = JsonUtils.objectToJson(orderResult);
        System.out.println("result:" + result);
        return result;
    }

    @RequestMapping("/list")
    public String getOrderListByOption() {
        Result<List<OrderDTO>> orderList = orderService.selecOrdertListByParam();
        return JsonUtils.objectToJson(orderList);
    }

}
