package com.binzhou.zhy.service.impl;

import com.binzhou.zhy.dao.OrderDetailDao;
import com.binzhou.zhy.entity.OrderDetail;
import com.binzhou.zhy.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-07-01 20:49
 **/

@Service("orderDetailService")
public class OrderDetailServiceImpl implements IOrderDetailService {

    @Autowired
    private OrderDetailDao orderDetailDao;

    @Override
    public OrderDetail selectByPrimaryKey(Long id) {
        return orderDetailDao.selectByPrimaryKey(id);
    }

    @Override
    public List<OrderDetail> selectListByOption(OrderDetail record) {
        return orderDetailDao.selectListByOption(record);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderDetailDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OrderDetail record) {
        return orderDetailDao.insert(record);
    }

    @Override
    public int insertSelective(OrderDetail record) {
        return orderDetailDao.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderDetail record) {
        return orderDetailDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderDetail record) {
        return orderDetailDao.updateByPrimaryKey(record);
    }
}
