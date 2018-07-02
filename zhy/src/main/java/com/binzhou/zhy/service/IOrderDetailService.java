package com.binzhou.zhy.service;

import com.binzhou.zhy.entity.OrderDetail;

import java.util.List;

public interface IOrderDetailService {

    public OrderDetail selectByPrimaryKey(Long id);

    public List<OrderDetail> selectListByOption(OrderDetail record);

    public int deleteByPrimaryKey(Long id);

    public int insert(OrderDetail record);

    public int insertSelective(OrderDetail record);

    public int updateByPrimaryKeySelective(OrderDetail record);

    public int updateByPrimaryKey(OrderDetail record);
}
