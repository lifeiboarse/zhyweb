package com.binzhou.zhy.model.dto.basic;

/**
 * @author lifeifei
 * @create 2018-06-26 17:26
 **/

public class ShoppingCartDTO {
    /**自动编号 (id)**/
    private Long id;

    /**用户编号 (user_id)**/
    private Long userId;

    /**店铺ID(标识哪个商铺的订单)**/
    private Long shopId;

    /**商品编号 (product_id)**/
    private Long goodsId;

    /**是否有效 (is_product_exists)**/
    private String isProductExists;

	/**购买数量 (number)**/
	private Integer count;

	/**创建时间 (created_time)**/
	private java.util.Date createdTime;

	/**规格ID**/
	private Long specId;

    /**详细说明**/
    private String specification;

    /**价格**/
    private java.math.BigDecimal price;

	/**商品是否选中(选中success,反选circle)**/
	private String type;

	/**数量**/
	private Integer quantity;

    /**商品图片地址**/
    private String goodsImage;

    /****/
    private java.util.Date gmtCreate;

    /****/
    private java.util.Date gmtModified;

    /****/
    private String modifier;

    /****/
    private String creator;

    /****/
    private String version;



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

    public void setGoodsId(Long goodsId){
        this.goodsId = goodsId;
    }

    public Long getGoodsId(){
        return this.goodsId;
    }

    public void setIsProductExists(String isProductExists){
        this.isProductExists = isProductExists;
    }

    public String getIsProductExists(){
        return this.isProductExists;
    }

	public void setCount(Integer count){
		this.count = count;
	}

	public Integer getCount(){
		return this.count;
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

    public void setPrice(java.math.BigDecimal price){
        this.price = price;
    }

    public java.math.BigDecimal getPrice(){
        return this.price;
    }

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return this.type;
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

    public void setGmtCreate(java.util.Date gmtCreate){
        this.gmtCreate = gmtCreate;
    }

    public java.util.Date getGmtCreate(){
        return this.gmtCreate;
    }

    public void setGmtModified(java.util.Date gmtModified){
        this.gmtModified = gmtModified;
    }

    public java.util.Date getGmtModified(){
        return this.gmtModified;
    }

    public void setModifier(String modifier){
        this.modifier = modifier;
    }

    public String getModifier(){
        return this.modifier;
    }

    public void setCreator(String creator){
        this.creator = creator;
    }

    public String getCreator(){
        return this.creator;
    }

    public void setVersion(String version){
        this.version = version;
    }

    public String getVersion(){
        return this.version;
    }
}
