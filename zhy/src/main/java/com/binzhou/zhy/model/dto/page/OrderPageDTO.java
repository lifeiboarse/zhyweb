package com.binzhou.zhy.model.dto.page;

import com.binzhou.zhy.entity.Address;
import com.binzhou.zhy.entity.Logistics;
import com.binzhou.zhy.entity.LogisticsTraces;
import com.binzhou.zhy.model.dto.basic.OrderDTO;
import com.binzhou.zhy.model.dto.basic.ProductDTO;

import java.util.List;
import java.util.Map;

/**
 * @author lifeifei
 * @create 2018-06-30 12:54
 **/

public class OrderPageDTO {

    private Long orderId;
    private OrderDTO order;
    private OrderDTO orderInfo;
    private List<ProductDTO> goods;

    private List<OrderDTO> orderList;
    private Map<Long,List<ProductDTO>> goodsMap;
    private Logistics logistics;
    private List<LogisticsTraces> logisticsTraces;
    private Address address;
    //private List<ProductDTO> cartProductList;

    private String isNeedLogistics;
    private String        amountTotle;
    private String amountLogistics;
    private Integer         orderNumber;
    private java.util.Date dateAdd;
    private String         amountReal;
    private Long id;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public OrderDTO getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderDTO orderInfo) {
        this.orderInfo = orderInfo;
    }

    public List<OrderDTO> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderDTO> orderList) {
        this.orderList = orderList;
    }

    public String getIsNeedLogistics() {
        return isNeedLogistics;
    }

    public void setIsNeedLogistics(String isNeedLogistics) {
        this.isNeedLogistics = isNeedLogistics;
    }

    public String getAmountTotle() {
        return amountTotle;
    }

    public void setAmountTotle(String amountTotle) {
        this.amountTotle = amountTotle;
    }

    public String getAmountLogistics() {
        return amountLogistics;
    }

    public void setAmountLogistics(String amountLogistics) {
        this.amountLogistics = amountLogistics;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public java.util.Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(java.util.Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    public String getAmountReal() {
        return amountReal;
    }

    public void setAmountReal(String amountReal) {
        this.amountReal = amountReal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderDTO getOrder() {
        return order;
    }

    public void setOrder(OrderDTO order) {
        this.order = order;
    }

    public Map<Long, List<ProductDTO>> getGoodsMap() {
        return goodsMap;
    }

    public void setGoodsMap(Map<Long, List<ProductDTO>> goodsMap) {
        this.goodsMap = goodsMap;
    }

    public List<ProductDTO> getGoods() {
        return goods;
    }

    public void setGoods(List<ProductDTO> goods) {
        this.goods = goods;
    }

    public Logistics getLogistics() {
        return logistics;
    }

    public void setLogistics(Logistics logistics) {
        this.logistics = logistics;
    }

    public List<LogisticsTraces> getLogisticsTraces() {
        return logisticsTraces;
    }

    public void setLogisticsTraces(List<LogisticsTraces> logisticsTraces) {
        this.logisticsTraces = logisticsTraces;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
