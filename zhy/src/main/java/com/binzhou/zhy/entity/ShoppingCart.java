package com.binzhou.zhy.entity;
import java.io.Serializable;


/**id
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class ShoppingCart implements Serializable {

	/**自动编号 (id)**/
	private Long id;

	/**用户编号 (user_id)**/
	private Long userId;

	/**店铺ID(标识哪个商铺的订单)**/
	private Long shopId;

	/**商品编号 (product_id)**/
	private Long productId;

	/**商品图片地址**/
	private String productImage;

	/**购买数量 (number)**/
	private Integer productCount;

	/**价格**/
	private java.math.BigDecimal productPrice;

	/**是否有效 (is_product_exists)**/
	private String isProductExists;

	/**创建时间 (created_time)**/
	private java.util.Date createdTime;

	/**规格ID**/
	private Long specId;

	/**详细说明**/
	private String specification;

	/**商品是否选中(选中success,反选circle)**/
	private String type;

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

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return this.userId;
	}

	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	public Long getShopId(){
		return this.shopId;
	}

	public void setProductId(Long productId){
		this.productId = productId;
	}

	public Long getProductId(){
		return this.productId;
	}

	public void setProductImage(String productImage){
		this.productImage = productImage;
	}

	public String getProductImage(){
		return this.productImage;
	}

	public void setProductCount(Integer productCount){
		this.productCount = productCount;
	}

	public Integer getProductCount(){
		return this.productCount;
	}

	public void setProductPrice(java.math.BigDecimal productPrice){
		this.productPrice = productPrice;
	}

	public java.math.BigDecimal getProductPrice(){
		return this.productPrice;
	}

	public void setIsProductExists(String isProductExists){
		this.isProductExists = isProductExists;
	}

	public String getIsProductExists(){
		return this.isProductExists;
	}

	public void setCreatedTime(java.util.Date createdTime){
		this.createdTime = createdTime;
	}

	public java.util.Date getCreatedTime(){
		return this.createdTime;
	}

	public void setSpecId(Long specId){
		this.specId = specId;
	}

	public Long getSpecId(){
		return this.specId;
	}

	public void setSpecification(String specification){
		this.specification = specification;
	}

	public String getSpecification(){
		return this.specification;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return this.type;
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
