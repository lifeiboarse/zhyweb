package com.binzhou.zhy.model.dto.page;

import com.binzhou.zhy.model.dto.basic.GoodsDTO;
import com.binzhou.zhy.model.dto.basic.OrderDTO;

import java.util.List;

/**
 * @author lifeifei
 * @create 2018-06-30 12:54
 **/

public class OrderPageDTO {

    private Long orderId;
    private OrderDTO order;
    private List<OrderDTO> orderList;
    private List<GoodsDTO> cartProductList;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public OrderDTO getOrder() {
        return order;
    }

    public void setOrder(OrderDTO order) {
        this.order = order;
    }

    public List<OrderDTO> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderDTO> orderList) {
        this.orderList = orderList;
    }

    public List<GoodsDTO> getCartProductList() {
        return cartProductList;
    }

    public void setCartProductList(List<GoodsDTO> cartProductList) {
        this.cartProductList = cartProductList;
    }
}
