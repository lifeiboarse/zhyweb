package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.Address;
import com.binzhou.zhy.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-06-23 10:55
 **/
@Component
public class AddressDao {

    @Autowired
    AddressMapper addressMapper;

    /**
     *
     * 查询（根据主键ID查询）
     *
     **/
    public Address selectByPrimaryKey(Long addressId){
        return addressMapper.selectByPrimaryKey(addressId);
    }

    public List<Address> selectListByOption(Address record){
        return addressMapper.selectListByOption(record);
    }
    /**
     *
     * 删除（根据主键ID删除）
     *
     **/
    public int deleteByPrimaryKey(Long addressId){
        return addressMapper.deleteByPrimaryKey(addressId);
    }

    /**
     *
     * 添加
     *
     **/
    public int insert(Address record){
        return addressMapper.insert(record);
    }

    /**
     *
     * 添加 （匹配有值的字段）
     *
     **/
    public int insertSelective(Address record){
        return addressMapper.insertSelective(record);
    }

    /**
     *
     * 修改 （匹配有值的字段）
     *
     **/
    public int updateByPrimaryKeySelective(Address record){
        return addressMapper.updateByPrimaryKeySelective(record);
    }

    /**
     *
     * 修改（根据主键ID修改）
     *
     **/
    public int updateByPrimaryKey(Address record){
        return addressMapper.updateByPrimaryKey(record);
    }
}
