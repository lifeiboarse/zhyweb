package com.binzhou.zhy.controller;

import com.binzhou.zhy.common.util.JsonUtils;
import com.binzhou.zhy.model.dto.basic.OrderDTO;
import com.binzhou.zhy.model.dto.page.OrderPageDTO;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @RequestMapping(value = "/query", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    public String get(@RequestParam("id") Long id) {
        Result<OrderDTO> orderResult = orderService.getOrderById(id);
        String result = JsonUtils.objectToJson(orderResult);
        System.out.println("result:" + result);
        return result;
    }

    @RequestMapping(value = "/placeOrder", method = {RequestMethod.GET})
    @ResponseBody
    public Result<OrderPageDTO> placeOrder(OrderDTO orderDTO) {
        Result<OrderPageDTO> orderPageDTOResult = orderService.placeOrder(orderDTO);
        return orderPageDTOResult;
    }

    @RequestMapping(value = "/list", produces = "application/json;charset=utf-8", method = {RequestMethod.GET})
    @ResponseBody
    public String getOrderListByOption(OrderDTO orderDTO) {
        Result<OrderPageDTO> orderList = orderService.selectListByOption(null);
        return JsonUtils.objectToJson(orderList);
    }

    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    @ResponseBody
    public Result save(@RequestBody OrderDTO orderDTO) {
        return orderService.insert(orderDTO);
    }

    @RequestMapping(value = "/saveSelective", method = {RequestMethod.POST})
    @ResponseBody
    public Result saveSelective(@RequestBody OrderDTO orderDTO) {
        return orderService.insertSelective(orderDTO);
    }

    @RequestMapping(value = "/update", method = {RequestMethod.POST})
    @ResponseBody
    public Result update(@RequestBody OrderDTO orderDTO) {
        return orderService.updateByPrimaryKey(orderDTO);
    }

    @RequestMapping(value = "/updateSelective", method = {RequestMethod.POST})
    @ResponseBody
    public Result updateSelective(@RequestBody OrderDTO orderDTO) {
        return orderService.updateByPrimaryKeySelective(orderDTO);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Result delete(@RequestParam(value = "id", defaultValue = "0") Long id) {
        return orderService.deleteByPrimaryKey(id);
    }
}
