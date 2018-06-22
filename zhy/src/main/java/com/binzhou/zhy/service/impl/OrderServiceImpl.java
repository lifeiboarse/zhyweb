package com.binzhou.zhy.service.impl;

import com.binzhou.zhy.common.util.ObjectConvertUtil;
import com.binzhou.zhy.dao.OrderDao;
import com.binzhou.zhy.entity.OrderDO;
import com.binzhou.zhy.exception.ErrorCodeEnum;
import com.binzhou.zhy.model.dto.basic.OrderDTO;
import com.binzhou.zhy.model.result.Result;
import com.binzhou.zhy.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements IOrderService {

    @Autowired
    OrderDao orderDao;


    @Override
    public Result<OrderDTO> getOrderById(Long id) {
        Result<OrderDTO> result = new Result<OrderDTO>();
        if (null == id || id.compareTo(0L) <= 0) {
            result.setErrorCode(ErrorCodeEnum.PARAM_ERROR);
            return result;
        }
        OrderDO orderDO = orderDao.getOrderById(id);
        OrderDTO orderDTO = ObjectConvertUtil.convertOrderDOToOrderDTO(orderDO);
        result.setData(orderDTO);
        return result;
    }

    public Result<List<OrderDTO>> selecOrdertListByParam() {
        Result<List<OrderDTO>> result = new Result<List<OrderDTO>>();
        List<OrderDTO> orderList = new ArrayList<OrderDTO>();
        List<OrderDO> orderDOList = orderDao.selecOrdertListByParam();
        for (OrderDO orderDO : orderDOList) {
            OrderDTO orderDTO = ObjectConvertUtil.convertOrderDOToOrderDTO(orderDO);
            orderList.add(orderDTO);
        }
        result.setData(orderList);
        return result;
    }
}
