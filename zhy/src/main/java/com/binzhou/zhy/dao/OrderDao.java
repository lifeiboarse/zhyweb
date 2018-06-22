package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.OrderDO;
import com.binzhou.zhy.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderDao {

    @Autowired
    public OrderMapper orderMapper;

    public OrderDO getOrderById(Long id) {
        OrderDO orderDO = orderMapper.selectByPrimaryKey(id);
        return orderDO;
    }

    public List<OrderDO> selecOrdertListByParam() {
        List<OrderDO> orderList = orderMapper.selecOrdertListByParam();
        return orderList;
    }
}
