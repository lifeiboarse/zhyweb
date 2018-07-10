package com.binzhou.zhy.service.impl;

import com.binzhou.zhy.dao.AddressDao;
import com.binzhou.zhy.entity.Address;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-06-23 11:04
 **/

@Service("addressService")
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressDao addressDao;

    @Override
    public Result<Address> selectById(Long addressId) {
        Result<Address> result = new Result<Address>();
        Address address = addressDao.selectByPrimaryKey(addressId);
        result.setData(address);
        return result;
    }

    @Override
    public Result<List<Address>> selectListByOption(Address address) {
        Result<List<Address>> result = new Result<List<Address>>();
        List<Address> addresses = addressDao.selectListByOption(address);

        result.setData(addresses);
        return result;
    }

    @Override
    public Result deleteById(Long addressId) {
        Result result = new Result();
        int i = addressDao.deleteByPrimaryKey(addressId);
        result.setData(i);
        return result;
    }

    @Override
    public int insert(Address record) {
        return addressDao.insert(record);
    }

    @Override
    public Result insertSelective(Address record) {
        Result result = new Result();
        int i = addressDao.insertSelective(record);
        result.setData(i);
        return result;
    }

    @Override
    public Result updateByIdSelective(Address record) {
        Result result = new Result();
        int i = addressDao.updateByPrimaryKeySelective(record);
        result.setData(i);
        return result;
    }

    @Override
    public int updateById(Address record) {
        return addressDao.updateByPrimaryKey(record);
    }
}
