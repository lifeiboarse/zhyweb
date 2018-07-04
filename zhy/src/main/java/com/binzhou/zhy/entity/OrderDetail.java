package com.binzhou.zhy.entity;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class OrderDetail implements Serializable {

	/**自动编号**/
	private Long id;

	/**订单编号**/
	private Long orderNo;

	/**商品编号**/
	private Long productId;

	/**商品名称 (product_name, 商品可能删除,所以这里要记录，不能直接读商品表)**/
	private String productName;

	/**商品价格 (product_price, 商品可能删除,所以这里要记录)**/
	private java.math.BigDecimal productPrice;

	/**购买数量 (number)**/
	private Integer productNumber;

	/**商品型号 (product_marque，前台展示给客户)**/
	private String productMarque;

	/**商品条码 (product_store_barcode, 商品仓库条码)**/
	private String productStoreBarcode;

	/**商品型号信息 (product_mode_desc，记录详细商品型号，如颜色、规格、包装等)**/
	private String productModeDesc;

	/**商品型号参数 (product_mode_params, JSON格式，记录单位编号、颜色编号、规格编号等)**/
	private String productModeParams;

	/**折扣比例 (discount_rate 打几折)**/
	private String discountRate;

	/**折扣金额 (discount_amount)**/
	private String discountAmount;

	/**小计金额 (subtotal)**/
	private String subtotal;

	/**商品是否有效 (is_product_exists)**/
	private String isProductExists;

	/**客户商品备注 (remark)**/
	private String remark;

	/**创建者**/
	private String creator;

	/**创建时间**/
	private java.util.Date gmtCreate;

	/**修改人**/
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

	public void setProductId(Long productId){
		this.productId = productId;
	}

	public Long getProductId(){
		return this.productId;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductName(){
		return this.productName;
	}

	public void setProductPrice(java.math.BigDecimal productPrice){
		this.productPrice = productPrice;
	}

	public java.math.BigDecimal getProductPrice(){
		return this.productPrice;
	}

	public void setProductNumber(Integer productNumber){
		this.productNumber = productNumber;
	}

	public Integer getProductNumber(){
		return this.productNumber;
	}

	public void setProductMarque(String productMarque){
		this.productMarque = productMarque;
	}

	public String getProductMarque(){
		return this.productMarque;
	}

	public void setProductStoreBarcode(String productStoreBarcode){
		this.productStoreBarcode = productStoreBarcode;
	}

	public String getProductStoreBarcode(){
		return this.productStoreBarcode;
	}

	public void setProductModeDesc(String productModeDesc){
		this.productModeDesc = productModeDesc;
	}

	public String getProductModeDesc(){
		return this.productModeDesc;
	}

	public void setProductModeParams(String productModeParams){
		this.productModeParams = productModeParams;
	}

	public String getProductModeParams(){
		return this.productModeParams;
	}

	public void setDiscountRate(String discountRate){
		this.discountRate = discountRate;
	}

	public String getDiscountRate(){
		return this.discountRate;
	}

	public void setDiscountAmount(String discountAmount){
		this.discountAmount = discountAmount;
	}

	public String getDiscountAmount(){
		return this.discountAmount;
	}

	public void setSubtotal(String subtotal){
		this.subtotal = subtotal;
	}

	public String getSubtotal(){
		return this.subtotal;
	}

	public void setIsProductExists(String isProductExists){
		this.isProductExists = isProductExists;
	}

	public String getIsProductExists(){
		return this.isProductExists;
	}

	public void setRemark(String remark){
		this.remark = remark;
	}

	public String getRemark(){
		return this.remark;
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

}
