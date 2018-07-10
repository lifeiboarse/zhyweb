package com.binzhou.zhy.controller;

import com.alibaba.fastjson.JSONObject;
import com.binzhou.zhy.common.util.JsonUtils;
import com.binzhou.zhy.entity.OrderDetail;
import com.binzhou.zhy.entity.Reputation;
import com.binzhou.zhy.model.dto.basic.OrderDTO;
import com.binzhou.zhy.model.dto.page.OrderPageDTO;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @RequestMapping(value = "/detail", produces = "application/json;charset=utf-8")
    @ResponseBody
    public Result<OrderPageDTO> get(@RequestParam("id") Long id) {
        Result<OrderPageDTO> orderResult = orderService.getOrderById(id);
        return orderResult;
    }

    @RequestMapping(value = "/placeOrder", produces = "application/json;charset=utf-8", method = {RequestMethod.GET})
    @ResponseBody
    public Result<OrderPageDTO> placeOrder(OrderDTO orderDTO) {
        Result<OrderPageDTO> orderPageDTOResult = orderService.placeOrder(orderDTO);
        return orderPageDTOResult;
    }

    @RequestMapping(value = "/generateOrder", produces = "application/json;charset=utf-8", method = {RequestMethod.POST})
    @ResponseBody
    public Result<OrderPageDTO> selectListByOption(@RequestBody List<Long> carts) {
        Result<OrderPageDTO> orderPageDTOResult = orderService.generateOrder(carts);
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

    @RequestMapping(value = "/create", method = {RequestMethod.POST})
    @ResponseBody
    public Result saveSelective(@RequestBody OrderDTO orderDTO) {
        List<OrderDetail> orderDetails = JsonUtils.jsonToList(orderDTO.getGoodsJsonStr(), OrderDetail.class);
        orderDTO.setOrderDetailList(orderDetails);
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

    @RequestMapping(value = "/delivery", method = {RequestMethod.POST})
    @ResponseBody
    public Result delivery(@RequestBody String postJsonString) {
        JSONObject object = JSONObject.parseObject(postJsonString);
        Long orderId = object.getLong("orderId");
        return orderService.delivery(Long.valueOf(orderId));
    }

    @RequestMapping(value = "/reputation", method = {RequestMethod.POST})
    @ResponseBody
    public Result reputation(@RequestBody String postJsonString) {
        JSONObject object = JSONObject.parseObject(postJsonString);
        String reputations = object.getString("reputations");
        Long orderId = object.getLong("orderId");
        List<Reputation> reputationList = JsonUtils.jsonToList(reputations, Reputation.class);
        if (null != reputationList && reputationList.size() > 0) {
            for (Reputation reputation : reputationList) {
                reputation.setOrderNo(orderId);
            }
        }
        return orderService.batchInsert(reputationList);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Result delete(@RequestParam(value = "id", defaultValue = "0") Long id) {
        return orderService.deleteByPrimaryKey(id);
    }
}
