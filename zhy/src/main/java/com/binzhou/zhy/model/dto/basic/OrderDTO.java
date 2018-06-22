package com.binzhou.zhy.model.dto.basic;

import com.binzhou.zhy.model.BaseDO;

import java.util.Date;
import java.util.List;

public class OrderDTO extends BaseDO {
    private Long orderId;//自动编号自增长主键
    private Long orderNo;//订单单号唯一值，供客户查询
    private Long shopId;//商店编号, 商店表自动编号
    private Long invoiceId;//发票编号,订单发票表自动编号
    private Long addressId;//收货地址编号, 收货地址表自动编号
    private Long orderLogisticsId;//订单物流编号, 订单物流表自动编号
    private Long outTradeNo;//订单支付单号 (out_trade_no/escrow_trade_no),第三方支付流水号
    private Long userId;//客户编号，用户表自动编号
    private int orderStatus;//订单状态,未付款,已付款,已发货,已签收,退货申请,退货中,已退货,取消交易
    private int productCount;//商品数量, 商品项目数量，不是商品
    private String productAmountTotal;//商品总价
    private String orderAmountTotal;//订单金额，实际付款金额
    private String logisticsFee;//运费金额
    private String isUnpackingInspection;//是否开箱验货
    private String openInvoice;//是否开票
    private String payChannel;//订单支付渠道

    private Date createdTime;//创建时间
    private Date payTime;//付款时间
    private Date deliveryTime;//发货时间
    private Date orderSettlementTime;//订单结算时间
    private Date gmtCreate;//
    private Date gmtModified;//
    
    private String customer_remark;//客户备注
    private String orderSettlementStatus;//订单结算状态，货到付款、分期付款会用到
    private String isDeleted;//是否删除(0、正常，-1删除)',
    private String operStatus;//
    private String status;//
    private String modifier;//
    private String version;//

    private List<GoodsDTO> orderGoodsList ;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getOrderLogisticsId() {
        return orderLogisticsId;
    }

    public void setOrderLogisticsId(Long orderLogisticsId) {
        this.orderLogisticsId = orderLogisticsId;
    }

    public Long getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(Long outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public String getProductAmountTotal() {
        return productAmountTotal;
    }

    public void setProductAmountTotal(String productAmountTotal) {
        this.productAmountTotal = productAmountTotal;
    }

    public String getOrderAmountTotal() {
        return orderAmountTotal;
    }

    public void setOrderAmountTotal(String orderAmountTotal) {
        this.orderAmountTotal = orderAmountTotal;
    }

    public String getLogisticsFee() {
        return logisticsFee;
    }

    public void setLogisticsFee(String logisticsFee) {
        this.logisticsFee = logisticsFee;
    }

    public String getIsUnpackingInspection() {
        return isUnpackingInspection;
    }

    public void setIsUnpackingInspection(String isUnpackingInspection) {
        this.isUnpackingInspection = isUnpackingInspection;
    }

    public String getOpenInvoice() {
        return openInvoice;
    }

    public void setOpenInvoice(String openInvoice) {
        this.openInvoice = openInvoice;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getOrderSettlementTime() {
        return orderSettlementTime;
    }

    public void setOrderSettlementTime(Date orderSettlementTime) {
        this.orderSettlementTime = orderSettlementTime;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getCustomer_remark() {
        return customer_remark;
    }

    public void setCustomer_remark(String customer_remark) {
        this.customer_remark = customer_remark;
    }

    public String getOrderSettlementStatus() {
        return orderSettlementStatus;
    }

    public void setOrderSettlementStatus(String orderSettlementStatus) {
        this.orderSettlementStatus = orderSettlementStatus;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getOperStatus() {
        return operStatus;
    }

    public void setOperStatus(String operStatus) {
        this.operStatus = operStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<GoodsDTO> getOrderGoodsList() {
        return orderGoodsList;
    }

    public void setOrderGoodsList(List<GoodsDTO> orderGoodsList) {
        this.orderGoodsList = orderGoodsList;
    }
}
