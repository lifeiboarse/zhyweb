package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.OrderDetail;
import com.binzhou.zhy.mapper.OrderDetailMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 服务dao
 *
 * @author lifeifei
 * @create 2018-06-21 10:38
 **/

@Component
public class OrderDetailDao {

    @Autowired
    OrderDetailMapper orderDetailMapper;

    public OrderDetail selectByPrimaryKey(Long id) {
        return orderDetailMapper.selectByPrimaryKey(id);
    }

    public List<OrderDetail> selectListByOption(OrderDetail record) {
        return orderDetailMapper.selectListByOption(record);
    }

    public int deleteByPrimaryKey(Long id) {
        return orderDetailMapper.deleteByPrimaryKey(id);
    }

    public int insert(OrderDetail record) {
        return orderDetailMapper.insert(record);
    }

    public int insertSelective(OrderDetail record) {
        return orderDetailMapper.insertSelective(record);
    }

    public int updateByPrimaryKeySelective(OrderDetail record) {
        return orderDetailMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(OrderDetail record) {
        return orderDetailMapper.updateByPrimaryKey(record);
    }
}
