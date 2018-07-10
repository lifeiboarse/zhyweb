package com.binzhou.zhy.service;

import com.binzhou.zhy.entity.Reputation;
import com.binzhou.zhy.model.dto.basic.OrderDTO;
import com.binzhou.zhy.model.dto.page.OrderPageDTO;
import com.binzhou.zhy.model.result.Result;

import java.util.List;

public interface IOrderService {

    public Result<OrderPageDTO> getOrderById(Long id);

    public Result<OrderPageDTO> selectListByOption(OrderDTO dto);

    public Result<OrderPageDTO> placeOrder(OrderDTO dto);

    public Result<OrderPageDTO> generateOrder(List<Long> carts);

    public Result deleteByPrimaryKey(Long id);

    public Result insert(OrderDTO dto);

    public Result insertSelective(OrderDTO dto);

    public Result updateByPrimaryKeySelective(OrderDTO dto);

    public Result delivery(Long id);

    public Result batchInsert(List<Reputation> list);

    public Result updateByPrimaryKey(OrderDTO dto);
}
