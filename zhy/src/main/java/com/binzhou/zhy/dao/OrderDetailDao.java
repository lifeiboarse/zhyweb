package com.binzhou.zhy.dao;

import com.binzhou.zhy.entity.OrderDetail;
import com.binzhou.zhy.mapper.OrderDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
