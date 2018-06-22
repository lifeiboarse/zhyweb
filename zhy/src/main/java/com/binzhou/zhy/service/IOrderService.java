package com.binzhou.zhy.service;

import com.binzhou.zhy.model.dto.basic.OrderDTO;
import com.binzhou.zhy.model.result.Result;

import java.util.List;

public interface IOrderService {

    Result<OrderDTO> getOrderById(Long id);

    Result<List<OrderDTO>> selecOrdertListByParam();
}
