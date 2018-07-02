package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.DeliveryAddress;
import com.binzhou.zhy.mapper.DeliveryAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-06-23 10:55
 **/
@Component
public class DeliveryAddressDao {

    @Autowired
    DeliveryAddressMapper deliveryAddressMapper;

    /**
     *
     * 查询（根据主键ID查询）
     *
     **/
    public DeliveryAddress selectByPrimaryKey(Long addressId){
        return deliveryAddressMapper.selectByPrimaryKey(addressId);
    }

    public List<DeliveryAddress> selectListByOption(DeliveryAddress record){
        return deliveryAddressMapper.selectListByOption(record);
    }
    /**
     *
     * 删除（根据主键ID删除）
     *
     **/
    public int deleteByPrimaryKey(Long addressId){
        return deliveryAddressMapper.deleteByPrimaryKey(addressId);
    }

    /**
     *
     * 添加
     *
     **/
    public int insert(DeliveryAddress record){
        return deliveryAddressMapper.insert(record);
    }

    /**
     *
     * 添加 （匹配有值的字段）
     *
     **/
    public int insertSelective(DeliveryAddress record){
        return deliveryAddressMapper.insertSelective(record);
    }

    /**
     *
     * 修改 （匹配有值的字段）
     *
     **/
    public int updateByPrimaryKeySelective(DeliveryAddress record){
        return deliveryAddressMapper.updateByPrimaryKeySelective(record);
    }

    /**
     *
     * 修改（根据主键ID修改）
     *
     **/
    public int updateByPrimaryKey(DeliveryAddress record){
        return deliveryAddressMapper.updateByPrimaryKey(record);
    }
}
