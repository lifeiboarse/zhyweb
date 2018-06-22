package com.binzhou.zhy.entity;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class GoodsDO implements Serializable {

	/**商品ID**/
	private int goodsId;

	/**店铺ID**/
	private int storeId;

	/**商品类型**/
	private String type;

	/**商品名**/
	private String goodsName;

	/**商品描述**/
	private String description;

	/**商品所属分类ID**/
	private int cateId;

	/**商品分类名**/
	private String cateName;

	/**商品品牌名**/
	private String brand;

	/**属性的数量数目**/
	private int specQty;

	/**第一属性名（比如颜色）**/
	private String speName1;

	/**第二属性名（比如尺码）**/
	private String speName2;

	/**是否显示（默认为1显示）**/
	private int ifShow;

	/**是否处于关闭状态（默认为0不关闭）**/
	private int closed;

	/**状态关闭原因**/
	private String closeReason;

	/**默认属性ID**/
	private int defaultSpec;

	/**默认商品图片地址**/
	private String defaultImage;

	/**是否推荐**/
	private int recommended;

	/**该商品第一级分类ID**/
	private int cateId1;

	/**该商品第二级分类ID**/
	private String cateId2;

	/**该商品第三级分类ID**/
	private String cateId3;

	/**该商品第四级分类ID**/
	private String cateId4;

	/**商品价格**/
	private BigDecimal price;

	/**检索标签**/
	private String tag;

	/**单位**/
	private String unit;



	public void setGoodsId(int goodsId){
		this.goodsId = goodsId;
	}

	public int getGoodsId(){
		return this.goodsId;
	}

	public void setStoreId(int storeId){
		this.storeId = storeId;
	}

	public int getStoreId(){
		return this.storeId;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return this.type;
	}

	public void setGoodsName(String goodsName){
		this.goodsName = goodsName;
	}

	public String getGoodsName(){
		return this.goodsName;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return this.description;
	}

	public void setCateId(int cateId){
		this.cateId = cateId;
	}

	public int getCateId(){
		return this.cateId;
	}

	public void setCateName(String cateName){
		this.cateName = cateName;
	}

	public String getCateName(){
		return this.cateName;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return this.brand;
	}

	public void setSpecQty(int specQty){
		this.specQty = specQty;
	}

	public int getSpecQty(){
		return this.specQty;
	}

	public void setSpeName1(String speName1){
		this.speName1 = speName1;
	}

	public String getSpeName1(){
		return this.speName1;
	}

	public void setSpeName2(String speName2){
		this.speName2 = speName2;
	}

	public String getSpeName2(){
		return this.speName2;
	}

	public void setIfShow(int ifShow){
		this.ifShow = ifShow;
	}

	public int getIfShow(){
		return this.ifShow;
	}

	public void setClosed(int closed){
		this.closed = closed;
	}

	public int getClosed(){
		return this.closed;
	}

	public void setCloseReason(String closeReason){
		this.closeReason = closeReason;
	}

	public String getCloseReason(){
		return this.closeReason;
	}

	public void setDefaultSpec(int defaultSpec){
		this.defaultSpec = defaultSpec;
	}

	public int getDefaultSpec(){
		return this.defaultSpec;
	}

	public void setDefaultImage(String defaultImage){
		this.defaultImage = defaultImage;
	}

	public String getDefaultImage(){
		return this.defaultImage;
	}

	public void setRecommended(int recommended){
		this.recommended = recommended;
	}

	public int getRecommended(){
		return this.recommended;
	}

	public void setCateId1(int cateId1){
		this.cateId1 = cateId1;
	}

	public int getCateId1(){
		return this.cateId1;
	}

	public void setCateId2(String cateId2){
		this.cateId2 = cateId2;
	}

	public String getCateId2(){
		return this.cateId2;
	}

	public void setCateId3(String cateId3){
		this.cateId3 = cateId3;
	}

	public String getCateId3(){
		return this.cateId3;
	}

	public void setCateId4(String cateId4){
		this.cateId4 = cateId4;
	}

	public String getCateId4(){
		return this.cateId4;
	}

	public void setPrice(java.math.BigDecimal price){
		this.price = price;
	}

	public java.math.BigDecimal getPrice(){
		return this.price;
	}

	public void setTag(String tag){
		this.tag = tag;
	}

	public String getTag(){
		return this.tag;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return this.unit;
	}

}
