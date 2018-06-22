package com.binzhou.zhy.entity;

public class OrderDO {
    /**
     * 自动编号（order_id, 自增长主键）
     **/
    private Integer orderId;

    /**
     * 订单单号（order_no, 唯一值，供客户查询）
     **/
    private Integer orderNo;

    /**
     * 商店编号（shop_id, 商店表自动编号）
     **/
    private Integer shopId;

    /**
     * 订单状态 (order_status,未付款,已付款,已发货,已签收,退货申请,退货中,已退货,取消交易)
     **/
    private String orderStatus;

    /**
     * 商品数量 (product_count, 商品项目数量，不是商品
     **/
    private String productCount;

    /**
     * 商品总价 (product_amount_total)
     **/
    private String productAmountTotal;

    /**
     * 订单金额 (order_amount_total，实际付款金额)
     **/
    private String orderAmountTotal;

    /**
     * 运费金额 (logistics_fee)
     **/
    private String logisticsFee;

    /**
     * 是否开箱验货 (is_unpacking_inspection)
     **/
    private String isUnpackingInspection;

    /**
     * 是否开票（是否开具发票）
     **/
    private String openInvoice;

    /**
     * 发票编号 (订单发票表自动编号)
     **/
    private Integer invoiceId;

    /**
     * 收货地址编号 (address_id, 收货地址表自动编号)
     **/
    private Integer addressId;

    /**
     * 订单物流编号 (orderlogistics_id, 订单物流表自动编号)
     **/
    private Integer orderlogisticsId;

    /**
     * 订单支付渠道 (pay_channel)
     **/
    private String payChannel;

    /**
     * 订单支付单号 (out_trade_no/escrow_trade_no,第三方支付流水号)
     **/
    private Integer outTradeNo;

    /**
     * 创建时间 (下单时间)
     **/
    private java.util.Date createdTime;

    /**
     * 付款时间
     **/
    private java.util.Date payTime;

    /**
     * 发货时间
     **/
    private java.util.Date deliveryTime;

    /**
     * 客户编号 (user_id，用户表自动编号)
     **/
    private Integer userId;

    /**
     * 客户备注
     **/
    private String customerRemark;

    /**
     * 订单结算状态 (order_settlement_status，货到付款、分期付款会用到)
     **/
    private String orderSettlementStatus;

    /**
     * 订单结算时间 (order_settlement_time)
     **/
    private java.util.Date orderSettlementTime;

    /**
     * 是否删除(0、正常，-1删除)
     **/
    private String isDeleted;

    /****/
    private String operStatus;

    /****/
    private String status;

    /****/
    private String gmtCreate;

    /****/
    private String gmtModified;

    /****/
    private String modifier;

    /****/
    private String version;


    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderId() {
        return this.orderId;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOrderNo() {
        return this.orderNo;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setProductCount(String productCount) {
        this.productCount = productCount;
    }

    public String getProductCount() {
        return this.productCount;
    }

    public void setProductAmountTotal(String productAmountTotal) {
        this.productAmountTotal = productAmountTotal;
    }

    public String getProductAmountTotal() {
        return this.productAmountTotal;
    }

    public void setOrderAmountTotal(String orderAmountTotal) {
        this.orderAmountTotal = orderAmountTotal;
    }

    public String getOrderAmountTotal() {
        return this.orderAmountTotal;
    }

    public void setLogisticsFee(String logisticsFee) {
        this.logisticsFee = logisticsFee;
    }

    public String getLogisticsFee() {
        return this.logisticsFee;
    }

    public void setIsUnpackingInspection(String isUnpackingInspection) {
        this.isUnpackingInspection = isUnpackingInspection;
    }

    public String getIsUnpackingInspection() {
        return this.isUnpackingInspection;
    }

    public void setOpenInvoice(String openInvoice) {
        this.openInvoice = openInvoice;
    }

    public String getOpenInvoice() {
        return this.openInvoice;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getInvoiceId() {
        return this.invoiceId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getAddressId() {
        return this.addressId;
    }

    public void setOrderlogisticsId(Integer orderlogisticsId) {
        this.orderlogisticsId = orderlogisticsId;
    }

    public Integer getOrderlogisticsId() {
        return this.orderlogisticsId;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getPayChannel() {
        return this.payChannel;
    }

    public void setOutTradeNo(Integer outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Integer getOutTradeNo() {
        return this.outTradeNo;
    }

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    public void setPayTime(java.util.Date payTime) {
        this.payTime = payTime;
    }

    public java.util.Date getPayTime() {
        return this.payTime;
    }

    public void setDeliveryTime(java.util.Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public java.util.Date getDeliveryTime() {
        return this.deliveryTime;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setCustomerRemark(String customerRemark) {
        this.customerRemark = customerRemark;
    }

    public String getCustomerRemark() {
        return this.customerRemark;
    }

    public void setOrderSettlementStatus(String orderSettlementStatus) {
        this.orderSettlementStatus = orderSettlementStatus;
    }

    public String getOrderSettlementStatus() {
        return this.orderSettlementStatus;
    }

    public void setOrderSettlementTime(java.util.Date orderSettlementTime) {
        this.orderSettlementTime = orderSettlementTime;
    }

    public java.util.Date getOrderSettlementTime() {
        return this.orderSettlementTime;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getIsDeleted() {
        return this.isDeleted;
    }

    public void setOperStatus(String operStatus) {
        this.operStatus = operStatus;
    }

    public String getOperStatus() {
        return this.operStatus;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getGmtModified() {
        return this.gmtModified;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifier() {
        return this.modifier;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return this.version;
    }
}
