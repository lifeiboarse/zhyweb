package com.binzhou.zhy.service.impl;

import com.binzhou.zhy.dao.DeliveryAddressDao;
import com.binzhou.zhy.entity.DeliveryAddress;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IDeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-06-23 11:04
 **/

@Service("deliveryAddressService")
public class DeliveryAddressServiceImpl implements IDeliveryAddressService {

    @Autowired
    private DeliveryAddressDao deliveryAddressDao;

    @Override
    public Result<DeliveryAddress> selectById(Long addressId) {
        Result<DeliveryAddress> result = new Result<DeliveryAddress>();
        DeliveryAddress deliveryAddress = deliveryAddressDao.selectByPrimaryKey(addressId);
        result.setData(deliveryAddress);
        return result;
    }

    @Override
    public Result<List<DeliveryAddress>> selectListByOption(DeliveryAddress deliveryAddress) {
        Result<List<DeliveryAddress>> result = new Result<List<DeliveryAddress>>();
        List<DeliveryAddress> deliveryAddresses = deliveryAddressDao.selectListByOption(deliveryAddress);

        result.setData(deliveryAddresses);
        return result;
    }

    @Override
    public int deleteById(Long addressId) {
        return deliveryAddressDao.deleteByPrimaryKey(addressId);
    }

    @Override
    public int insert(DeliveryAddress record) {
        return deliveryAddressDao.insert(record);
    }

    @Override
    public int insertSelective(DeliveryAddress record) {
        return deliveryAddressDao.insertSelective(record);
    }

    @Override
    public int updateByIdSelective(DeliveryAddress record) {
        return deliveryAddressDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateById(DeliveryAddress record) {
        return deliveryAddressDao.updateByPrimaryKey(record);
    }
}
