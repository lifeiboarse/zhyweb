package com.binzhou.zhy.entity;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class Order implements Serializable {

	/**自动编号（order_id, 自增长主键）**/
	private Long id;

	/**订单单号（order_no, 唯一值，供客户查询）**/
	private Long orderNo;

	/**商店编号（shop_id, 商店表自动编号）**/
	private Long shopId;

	/**订单状态 (order_status,未付款,已付款,已发货,已签收,退货申请,退货中,已退货,取消交易)**/
	private Integer orderStatus;

	/**商品数量 (product_count, 商品项目数量，不是商品**/
	private Integer productCount;

	/**商品总价 (product_amount_total)**/
	private java.math.BigDecimal productTotalPrice;

	/**订单金额 (order_amount_total，实际付款金额)**/
	private java.math.BigDecimal orderTotalPrice;

	/**运费金额 (logistics_fee)**/
	private java.math.BigDecimal logisticsFee;

	/**是否开箱验货 (is_unpacking_inspection)**/
	private String isUnpackingInspection;

	/**是否开票（是否开具发票）**/
	private String openInvoice;

	/**发票编号 (订单发票表自动编号)**/
	private Long invoiceId;

	/**收货地址编号 (address_id, 收货地址表自动编号)**/
	private Long addressId;

	/**客户编号 (user_id，用户表自动编号)**/
	private Long userId;

	/**订单物流编号 (orderlogistics_id, 订单物流表自动编号)**/
	private Long orderlogisticsId;

	/**订单支付渠道 (pay_channel)**/
	private String payChannel;

	/**订单支付单号 (out_trade_no/escrow_trade_no,第三方支付流水号)**/
	private Long outTradeNo;

	/**创建时间 (下单时间)**/
	private java.util.Date createdTime;

	/**付款时间**/
	private java.util.Date payTime;

	/**发货时间**/
	private java.util.Date deliveryTime;

	/**客户备注**/
	private String customerRemark;

	/**订单结算状态 (order_settlement_status，货到付款、分期付款会用到)**/
	private String orderSettlementStatus;

	/**订单结算时间 (order_settlement_time)**/
	private java.util.Date orderSettlementTime;

	/**创建者**/
	private String creator;

	/**创建时间**/
	private java.util.Date gmtCreate;

	/**修改者**/
	private String modifier;

	/**修改时间**/
	private java.util.Date gmtModified;

	/**状态，0正常，1审核中，2审核不通过**/
	private Integer status;

	/**0:生效，-1:待生效**/
	private Integer operStatus;

	/**是否删除(0、正常，-1删除)**/
	private Integer isDeleted;

	/**版本号**/
	private Long version;

	/****/
	private String remark;

	/****/
	private String calculate;

	/****/
	private String goodsJsonStr;

	/****/
	private String kjid;

	/****/
	private String couponId;



	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}

	public void setOrderNo(Long orderNo){
		this.orderNo = orderNo;
	}

	public Long getOrderNo(){
		return this.orderNo;
	}

	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	public Long getShopId(){
		return this.shopId;
	}

	public void setOrderStatus(Integer orderStatus){
		this.orderStatus = orderStatus;
	}

	public Integer getOrderStatus(){
		return this.orderStatus;
	}

	public void setProductCount(Integer productCount){
		this.productCount = productCount;
	}

	public Integer getProductCount(){
		return this.productCount;
	}

	public void setProductTotalPrice(java.math.BigDecimal productTotalPrice){
		this.productTotalPrice = productTotalPrice;
	}

	public java.math.BigDecimal getProductTotalPrice(){
		return this.productTotalPrice;
	}

	public void setOrderTotalPrice(java.math.BigDecimal orderTotalPrice){
		this.orderTotalPrice = orderTotalPrice;
	}

	public java.math.BigDecimal getOrderTotalPrice(){
		return this.orderTotalPrice;
	}

	public void setLogisticsFee(java.math.BigDecimal logisticsFee){
		this.logisticsFee = logisticsFee;
	}

	public java.math.BigDecimal getLogisticsFee(){
		return this.logisticsFee;
	}

	public void setIsUnpackingInspection(String isUnpackingInspection){
		this.isUnpackingInspection = isUnpackingInspection;
	}

	public String getIsUnpackingInspection(){
		return this.isUnpackingInspection;
	}

	public void setOpenInvoice(String openInvoice){
		this.openInvoice = openInvoice;
	}

	public String getOpenInvoice(){
		return this.openInvoice;
	}

	public void setInvoiceId(Long invoiceId){
		this.invoiceId = invoiceId;
	}

	public Long getInvoiceId(){
		return this.invoiceId;
	}

	public void setAddressId(Long addressId){
		this.addressId = addressId;
	}

	public Long getAddressId(){
		return this.addressId;
	}

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return this.userId;
	}

	public void setOrderlogisticsId(Long orderlogisticsId){
		this.orderlogisticsId = orderlogisticsId;
	}

	public Long getOrderlogisticsId(){
		return this.orderlogisticsId;
	}

	public void setPayChannel(String payChannel){
		this.payChannel = payChannel;
	}

	public String getPayChannel(){
		return this.payChannel;
	}

	public void setOutTradeNo(Long outTradeNo){
		this.outTradeNo = outTradeNo;
	}

	public Long getOutTradeNo(){
		return this.outTradeNo;
	}

	public void setCreatedTime(java.util.Date createdTime){
		this.createdTime = createdTime;
	}

	public java.util.Date getCreatedTime(){
		return this.createdTime;
	}

	public void setPayTime(java.util.Date payTime){
		this.payTime = payTime;
	}

	public java.util.Date getPayTime(){
		return this.payTime;
	}

	public void setDeliveryTime(java.util.Date deliveryTime){
		this.deliveryTime = deliveryTime;
	}

	public java.util.Date getDeliveryTime(){
		return this.deliveryTime;
	}

	public void setCustomerRemark(String customerRemark){
		this.customerRemark = customerRemark;
	}

	public String getCustomerRemark(){
		return this.customerRemark;
	}

	public void setOrderSettlementStatus(String orderSettlementStatus){
		this.orderSettlementStatus = orderSettlementStatus;
	}

	public String getOrderSettlementStatus(){
		return this.orderSettlementStatus;
	}

	public void setOrderSettlementTime(java.util.Date orderSettlementTime){
		this.orderSettlementTime = orderSettlementTime;
	}

	public java.util.Date getOrderSettlementTime(){
		return this.orderSettlementTime;
	}

	public void setCreator(String creator){
		this.creator = creator;
	}

	public String getCreator(){
		return this.creator;
	}

	public void setGmtCreate(java.util.Date gmtCreate){
		this.gmtCreate = gmtCreate;
	}

	public java.util.Date getGmtCreate(){
		return this.gmtCreate;
	}

	public void setModifier(String modifier){
		this.modifier = modifier;
	}

	public String getModifier(){
		return this.modifier;
	}

	public void setGmtModified(java.util.Date gmtModified){
		this.gmtModified = gmtModified;
	}

	public java.util.Date getGmtModified(){
		return this.gmtModified;
	}

	public void setStatus(Integer status){
		this.status = status;
	}

	public Integer getStatus(){
		return this.status;
	}

	public void setOperStatus(Integer operStatus){
		this.operStatus = operStatus;
	}

	public Integer getOperStatus(){
		return this.operStatus;
	}

	public void setIsDeleted(Integer isDeleted){
		this.isDeleted = isDeleted;
	}

	public Integer getIsDeleted(){
		return this.isDeleted;
	}

	public void setVersion(Long version){
		this.version = version;
	}

	public Long getVersion(){
		return this.version;
	}

	public void setRemark(String remark){
		this.remark = remark;
	}

	public String getRemark(){
		return this.remark;
	}

	public void setCalculate(String calculate){
		this.calculate = calculate;
	}

	public String getCalculate(){
		return this.calculate;
	}

	public void setGoodsJsonStr(String goodsJsonStr){
		this.goodsJsonStr = goodsJsonStr;
	}

	public String getGoodsJsonStr(){
		return this.goodsJsonStr;
	}

	public void setKjid(String kjid){
		this.kjid = kjid;
	}

	public String getKjid(){
		return this.kjid;
	}

	public void setCouponId(String couponId){
		this.couponId = couponId;
	}

	public String getCouponId(){
		return this.couponId;
	}

}
