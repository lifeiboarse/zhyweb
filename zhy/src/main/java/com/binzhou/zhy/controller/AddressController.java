package com.binzhou.zhy.controller;

import com.binzhou.zhy.entity.Address;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-06-23 11:15
 **/

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    IAddressService addressService;

    @RequestMapping(value = "/detail", method = {RequestMethod.GET})
    @ResponseBody
    public Result<Address> selectById(@RequestParam("id") Long id) {
        Result<Address> result = addressService.selectById(id);
        return result;
    }

    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    @ResponseBody
    public Result<List<Address>> selectListByOption(Address record) {
        Result<List<Address>> result = addressService.selectListByOption(record);
        return result;
    }

    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    @ResponseBody
    public int insert(@RequestBody Address record) {
        return addressService.insert(record);
    }

    @RequestMapping(value = "/add", method = {RequestMethod.POST})
    @ResponseBody
    public Result insertSelective(@RequestBody Address record) {
        return addressService.insertSelective(record);
    }

    @RequestMapping(value = "/update", method = {RequestMethod.POST})
    @ResponseBody
    public Result updateByIdSelective(@RequestBody Address record) {
        return addressService.updateByIdSelective(record);
    }

    @RequestMapping(value = "/update1", method = {RequestMethod.POST})
    @ResponseBody
    public int updateById(@RequestBody Address record) {
        return addressService.updateById(record);
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.POST})
    @ResponseBody
    public Result deleteById(@RequestParam("id") Long id) {
        return addressService.deleteById(id);
    }
}
