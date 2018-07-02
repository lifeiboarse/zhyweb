package com.binzhou.zhy.controller;

import com.binzhou.zhy.entity.DeliveryAddress;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IDeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-06-23 11:15
 **/

@RestController
@RequestMapping("/address")
public class DeliveryAddressController {

    @Autowired
    IDeliveryAddressService deliveryAddressService;

    @RequestMapping(value = "/query", method = {RequestMethod.GET})
    @ResponseBody
    public Result<DeliveryAddress> selectById(@RequestParam("id") Long id) {
        Result<DeliveryAddress> result = deliveryAddressService.selectById(id);
        return result;
    }

    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    @ResponseBody
    public Result<List<DeliveryAddress>> selectListByOption(DeliveryAddress record) {
        Result<List<DeliveryAddress>> result = deliveryAddressService.selectListByOption(record);
        return result;
    }

    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    @ResponseBody
    public int insert(@RequestBody DeliveryAddress record) {
        return deliveryAddressService.insert(record);
    }

    @RequestMapping(value = "/saveSelective", method = {RequestMethod.POST})
    @ResponseBody
    public int insertSelective(@RequestBody DeliveryAddress record) {
        return deliveryAddressService.insertSelective(record);
    }

    @RequestMapping(value = "/updateSelective", method = {RequestMethod.POST})
    @ResponseBody
    public int updateByIdSelective(@RequestBody DeliveryAddress record) {
        return deliveryAddressService.updateByIdSelective(record);
    }

    @RequestMapping(value = "/update", method = {RequestMethod.POST})
    @ResponseBody
    public int updateById(@RequestBody DeliveryAddress record) {
        return deliveryAddressService.updateById(record);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.POST})
    @ResponseBody
    public int deleteById(@RequestParam("id") Long id) {
        return deliveryAddressService.deleteById(id);
    }
}
