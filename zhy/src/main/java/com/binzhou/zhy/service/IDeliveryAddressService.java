package com.binzhou.zhy.service;

import com.binzhou.zhy.entity.DeliveryAddress;
import com.binzhou.zhy.model.result.Result;

import java.util.List;

public interface IDeliveryAddressService {
    public Result<DeliveryAddress> selectById(Long addressId);
    public Result<List<DeliveryAddress>> selectListByOption(DeliveryAddress deliveryAddress);
    public int deleteById(Long addressId);
    public int insert(DeliveryAddress record);
    public int insertSelective(DeliveryAddress record);
    public int updateByIdSelective(DeliveryAddress record);
    public int updateById(DeliveryAddress record);
}
