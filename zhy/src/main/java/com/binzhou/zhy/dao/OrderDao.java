package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.Order;
import com.binzhou.zhy.mapper.OrderMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderDao {

    @Autowired
    public OrderMapper orderMapper;


    public Order getOrderById(Long id) {
        Order order = orderMapper.selectByPrimaryKey(id);
        return order;
    }

    public List<Order> selectListByOption(Order order) {
        List<Order> orderList = orderMapper.selectListByOption(order);
        return orderList;
    }

    public int insert(Order record) {
        return orderMapper.insert(record);
    }

    public int insertSelective(Order record) {
        return orderMapper.insertSelective(record);
    }

    public int updateByPrimaryKeySelective(Order record) {
        return orderMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Order record) {
        return orderMapper.updateByPrimaryKey(record);
    }

    public int  delivery( Long id){
        return orderMapper.delivery(id);
    }

    public int deleteByPrimaryKey(Long id) {
        return orderMapper.deleteByPrimaryKey(id);
    }
}
