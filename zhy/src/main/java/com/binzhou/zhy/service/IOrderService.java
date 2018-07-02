package com.binzhou.zhy.service;

import com.binzhou.zhy.model.dto.basic.OrderDTO;
import com.binzhou.zhy.model.dto.page.OrderPageDTO;
import com.binzhou.zhy.model.result.Result;

public interface IOrderService {

    public Result<OrderDTO> getOrderById(Long id);

    public Result<OrderPageDTO> selectListByOption(OrderDTO dto);

    public Result<OrderPageDTO> placeOrder(OrderDTO dto);

    public Result deleteByPrimaryKey(Long id);

    public Result insert(OrderDTO dto);

    public Result insertSelective(OrderDTO dto);

    public Result updateByPrimaryKeySelective(OrderDTO dto);

    public Result updateByPrimaryKey(OrderDTO dto);
}
