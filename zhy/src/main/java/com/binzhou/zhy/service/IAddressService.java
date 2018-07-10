package com.binzhou.zhy.service;

import com.binzhou.zhy.entity.Address;
import com.binzhou.zhy.model.result.Result;

import java.util.List;

public interface IAddressService {
    public Result<Address> selectById(Long addressId);
    public Result<List<Address>> selectListByOption(Address address);
    public Result deleteById(Long addressId);
    public int insert(Address record);
    public Result insertSelective(Address record);
    public Result updateByIdSelective(Address record);
    public int updateById(Address record);
}
