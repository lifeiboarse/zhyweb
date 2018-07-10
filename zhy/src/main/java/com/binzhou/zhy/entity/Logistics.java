package com.binzhou.zhy.entity;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class Logistics implements Serializable {

	/**自动编号 (orderlogistics_id)**/
	private Long id;

	/**(order_id, 订单表自动编号)**/
	private Long orderNo;

	/**物流单号 (express_no, 发货快递单号)**/
	private Long expressNo;

	/**收货人姓名 (consignee_realname, 收货地址表可能更新或删除，因此要在这里记录)**/
	private String consigneeRealname;

	/**联系电话 (consignee_telphone, 收货地址表可能更新或删除，因此要在这里记录)**/
	private String consigneeTelphone;

	/**备用联系电话 (consignee_telphone2, 收货地址表可能更新或删除，因此要在这里记录)**/
	private String consigneeTelphone2;

	/**收货地址 (consignee_address, 收货地址表可能更新或删除，因此要在这里记录)**/
	private String consigneeAddress;

	/**邮政编码 (consignee_zip, 收货地址表可能更新或删除，因此要在这里记录)**/
	private String consigneeZip;

	/**物流方式（logistics_type, ems, express）**/
	private String logisticsType;

	/**物流商家编号 (logistics_id，物流商家表自动编号)**/
	private Long logisticsId;

	/**物流发货运费 (logistics_fee，显示给客户的订单运费)**/
	private String logisticsFee;

	/**快递代收货款费率 (agency_fee, 快递公司代收货款费率，如货值的2%-5%，一般月结)**/
	private String agencyFee;

	/**物流成本金额 (delivery_amount, 实际支付给物流公司的金额)**/
	private String deliveryAmount;

	/**物流状态 (orderlogistics_status)**/
	private String orderlogisticsStatus;

	/**物流结算状态 (logistics_settlement_status, 未结算,已结算,部分结算)**/
	private String logisticsSettlementStatus;

	/**物流最后状态描述 (logistics_result_last)**/
	private String logisticsResultLast;

	/** 物流描述 (logistics_result)**/
	private String logisticsResult;

	/**发货时间 (logistics_create_time)**/
	private java.util.Date logisticsCreateTime;

	/**物流更新时间 (logistics_update_time)**/
	private java.util.Date logisticsUpdateTime;

	/**物流结算时间 (logistics_settlement_time)**/
	private java.util.Date logisticsSettlementTime;

	/**物流支付渠道Logistics payment channel**/
	private String logisticsPayChannel;

	/**物流支付单号**/
	private String logisticsPayOrderNumber;

	/**物流公司已对账状态 (reconciliation_status，已对账,未对账)**/
	private String reconciliationStatus;

	/**物流公司对账日期 (reconciliation_time)**/
	private java.util.Date reconciliationTime;

	/****/
	private String isFree;

	/****/
	private Integer feeType;

	/****/
	private String feeTypeStr;

	/**物流单号**/
	private String trackingNumber;

	/**物流公司**/
	private String shipperName;



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

	public void setExpressNo(Long expressNo){
		this.expressNo = expressNo;
	}

	public Long getExpressNo(){
		return this.expressNo;
	}

	public void setConsigneeRealname(String consigneeRealname){
		this.consigneeRealname = consigneeRealname;
	}

	public String getConsigneeRealname(){
		return this.consigneeRealname;
	}

	public void setConsigneeTelphone(String consigneeTelphone){
		this.consigneeTelphone = consigneeTelphone;
	}

	public String getConsigneeTelphone(){
		return this.consigneeTelphone;
	}

	public void setConsigneeTelphone2(String consigneeTelphone2){
		this.consigneeTelphone2 = consigneeTelphone2;
	}

	public String getConsigneeTelphone2(){
		return this.consigneeTelphone2;
	}

	public void setConsigneeAddress(String consigneeAddress){
		this.consigneeAddress = consigneeAddress;
	}

	public String getConsigneeAddress(){
		return this.consigneeAddress;
	}

	public void setConsigneeZip(String consigneeZip){
		this.consigneeZip = consigneeZip;
	}

	public String getConsigneeZip(){
		return this.consigneeZip;
	}

	public void setLogisticsType(String logisticsType){
		this.logisticsType = logisticsType;
	}

	public String getLogisticsType(){
		return this.logisticsType;
	}

	public void setLogisticsId(Long logisticsId){
		this.logisticsId = logisticsId;
	}

	public Long getLogisticsId(){
		return this.logisticsId;
	}

	public void setLogisticsFee(String logisticsFee){
		this.logisticsFee = logisticsFee;
	}

	public String getLogisticsFee(){
		return this.logisticsFee;
	}

	public void setAgencyFee(String agencyFee){
		this.agencyFee = agencyFee;
	}

	public String getAgencyFee(){
		return this.agencyFee;
	}

	public void setDeliveryAmount(String deliveryAmount){
		this.deliveryAmount = deliveryAmount;
	}

	public String getDeliveryAmount(){
		return this.deliveryAmount;
	}

	public void setOrderlogisticsStatus(String orderlogisticsStatus){
		this.orderlogisticsStatus = orderlogisticsStatus;
	}

	public String getOrderlogisticsStatus(){
		return this.orderlogisticsStatus;
	}

	public void setLogisticsSettlementStatus(String logisticsSettlementStatus){
		this.logisticsSettlementStatus = logisticsSettlementStatus;
	}

	public String getLogisticsSettlementStatus(){
		return this.logisticsSettlementStatus;
	}

	public void setLogisticsResultLast(String logisticsResultLast){
		this.logisticsResultLast = logisticsResultLast;
	}

	public String getLogisticsResultLast(){
		return this.logisticsResultLast;
	}

	public void setLogisticsResult(String logisticsResult){
		this.logisticsResult = logisticsResult;
	}

	public String getLogisticsResult(){
		return this.logisticsResult;
	}

	public void setLogisticsCreateTime(java.util.Date logisticsCreateTime){
		this.logisticsCreateTime = logisticsCreateTime;
	}

	public java.util.Date getLogisticsCreateTime(){
		return this.logisticsCreateTime;
	}

	public void setLogisticsUpdateTime(java.util.Date logisticsUpdateTime){
		this.logisticsUpdateTime = logisticsUpdateTime;
	}

	public java.util.Date getLogisticsUpdateTime(){
		return this.logisticsUpdateTime;
	}

	public void setLogisticsSettlementTime(java.util.Date logisticsSettlementTime){
		this.logisticsSettlementTime = logisticsSettlementTime;
	}

	public java.util.Date getLogisticsSettlementTime(){
		return this.logisticsSettlementTime;
	}

	public void setLogisticsPayChannel(String logisticsPayChannel){
		this.logisticsPayChannel = logisticsPayChannel;
	}

	public String getLogisticsPayChannel(){
		return this.logisticsPayChannel;
	}

	public void setLogisticsPayOrderNumber(String logisticsPayOrderNumber){
		this.logisticsPayOrderNumber = logisticsPayOrderNumber;
	}

	public String getLogisticsPayOrderNumber(){
		return this.logisticsPayOrderNumber;
	}

	public void setReconciliationStatus(String reconciliationStatus){
		this.reconciliationStatus = reconciliationStatus;
	}

	public String getReconciliationStatus(){
		return this.reconciliationStatus;
	}

	public void setReconciliationTime(java.util.Date reconciliationTime){
		this.reconciliationTime = reconciliationTime;
	}

	public java.util.Date getReconciliationTime(){
		return this.reconciliationTime;
	}

	public void setIsFree(String isFree){
		this.isFree = isFree;
	}

	public String getIsFree(){
		return this.isFree;
	}

	public void setFeeType(Integer feeType){
		this.feeType = feeType;
	}

	public Integer getFeeType(){
		return this.feeType;
	}

	public void setFeeTypeStr(String feeTypeStr){
		this.feeTypeStr = feeTypeStr;
	}

	public String getFeeTypeStr(){
		return this.feeTypeStr;
	}

	public void setTrackingNumber(String trackingNumber){
		this.trackingNumber = trackingNumber;
	}

	public String getTrackingNumber(){
		return this.trackingNumber;
	}

	public void setShipperName(String shipperName){
		this.shipperName = shipperName;
	}

	public String getShipperName(){
		return this.shipperName;
	}

}
