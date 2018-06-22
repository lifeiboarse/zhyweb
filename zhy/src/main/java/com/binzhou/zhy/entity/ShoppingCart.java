package com.binzhou.zhy.entity;

import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class ShoppingCart implements Serializable {

	/**自动编号 (id)**/
	private Integer id;

	/**用户编号 (user_id)**/
	private Integer userId;

	/**店铺ID(标识哪个商铺的订单)**/
	private Integer shopId;

	/**商品编号 (product_id)**/
	private Integer productId;

	/**是否有效 (is_product_exists)**/
	private String isProductExists;

	/**购买数量 (number)**/
	private Integer number;

	/**创建时间 (created_time)**/
	private java.util.Date createdTime;

	/**规格ID**/
	private Integer specId;

	/**详细说明**/
	private String specification;

	/**价格**/
	private Double price;

	/**数量**/
	private Integer quantity;

	/**商品图片地址**/
	private String goodsImage;



	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return this.userId;
	}

	public void setShopId(Integer shopId){
		this.shopId = shopId;
	}

	public Integer getShopId(){
		return this.shopId;
	}

	public void setProductId(Integer productId){
		this.productId = productId;
	}

	public Integer getProductId(){
		return this.productId;
	}

	public void setIsProductExists(String isProductExists){
		this.isProductExists = isProductExists;
	}

	public String getIsProductExists(){
		return this.isProductExists;
	}

	public void setNumber(Integer number){
		this.number = number;
	}

	public Integer getNumber(){
		return this.number;
	}

	public void setCreatedTime(java.util.Date createdTime){
		this.createdTime = createdTime;
	}

	public java.util.Date getCreatedTime(){
		return this.createdTime;
	}

	public void setSpecId(Integer specId){
		this.specId = specId;
	}

	public Integer getSpecId(){
		return this.specId;
	}

	public void setSpecification(String specification){
		this.specification = specification;
	}

	public String getSpecification(){
		return this.specification;
	}

	public void setPrice(Double price){
		this.price = price;
	}

	public Double getPrice(){
		return this.price;
	}

	public void setQuantity(Integer quantity){
		this.quantity = quantity;
	}

	public Integer getQuantity(){
		return this.quantity;
	}

	public void setGoodsImage(String goodsImage){
		this.goodsImage = goodsImage;
	}

	public String getGoodsImage(){
		return this.goodsImage;
	}

}
