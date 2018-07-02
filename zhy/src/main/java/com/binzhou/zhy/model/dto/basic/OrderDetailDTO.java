package com.binzhou.zhy.model.dto.basic;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class OrderDetailDTO implements Serializable {

	/**自动编号**/
	private Long id;

	/**订单编号**/
	private Long orderId;

	/**商品编号**/
	private Long productId;

	/**商品名称 (product_name, 商品可能删除,所以这里要记录，不能直接读商品表)**/
	private String productName;

	/**商品价格 (product_price, 商品可能删除,所以这里要记录)**/
	private java.math.BigDecimal productPrice;

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

	/**购买数量 (number)**/
	private Integer number;

	/**小计金额 (subtotal)**/
	private String subtotal;

	/**商品是否有效 (is_product_exists)**/
	private String isProductExists;

	/**客户商品备注 (remark)**/
	private String remark;



	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}

	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}

	public Long getOrderId(){
		return this.orderId;
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

	public void setNumber(Integer number){
		this.number = number;
	}

	public Integer getNumber(){
		return this.number;
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

}
