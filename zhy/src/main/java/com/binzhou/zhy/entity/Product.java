package com.binzhou.zhy.entity;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class Product implements Serializable {

	/**商品ID**/
	private Long id;

	/**店铺ID**/
	private Long shopId;

	/**商品所属分类ID**/
	private Long cateId;

	/**商品名**/
	private String name;

	/**商品价格**/
	private java.math.BigDecimal price;

	/****/
	private Integer count;

	/**单位**/
	private String unit;

	/**默认商品图片地址**/
	private String image;

	/**商品描述**/
	private String description;

	/**商品品牌名**/
	private String brand;

	/**商品类型**/
	private String type;

	/**商品分类名**/
	private String cateName;

	/**属性的数量数目**/
	private Integer specNumber;

	/**第一属性名（比如颜色）**/
	private String speName1;

	/**第二属性名（比如尺码）**/
	private String speName2;

	/**是否显示（默认为1显示）**/
	private Integer ifShow;

	/**是否处于关闭状态（默认为0不关闭）**/
	private Integer closed;

	/**状态关闭原因**/
	private String closeReason;

	/**默认属性ID**/
	private Integer defaultSpec;

	/**是否推荐**/
	private Integer recommended;

	/**该商品第一级分类ID**/
	private Integer cateId1;

	/**该商品第二级分类ID**/
	private String cateId2;

	/**该商品第三级分类ID**/
	private String cateId3;

	/**该商品第四级分类ID**/
	private String cateId4;

	/**检索标签**/
	private String tag;

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
	private String version;



	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}

	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	public Long getShopId(){
		return this.shopId;
	}

	public void setCateId(Long cateId){
		this.cateId = cateId;
	}

	public Long getCateId(){
		return this.cateId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setPrice(java.math.BigDecimal price){
		this.price = price;
	}

	public java.math.BigDecimal getPrice(){
		return this.price;
	}

	public void setCount(Integer count){
		this.count = count;
	}

	public Integer getCount(){
		return this.count;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return this.unit;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return this.image;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return this.description;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return this.brand;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return this.type;
	}

	public void setCateName(String cateName){
		this.cateName = cateName;
	}

	public String getCateName(){
		return this.cateName;
	}

	public void setSpecNumber(Integer specNumber){
		this.specNumber = specNumber;
	}

	public Integer getSpecNumber(){
		return this.specNumber;
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

	public void setIfShow(Integer ifShow){
		this.ifShow = ifShow;
	}

	public Integer getIfShow(){
		return this.ifShow;
	}

	public void setClosed(Integer closed){
		this.closed = closed;
	}

	public Integer getClosed(){
		return this.closed;
	}

	public void setCloseReason(String closeReason){
		this.closeReason = closeReason;
	}

	public String getCloseReason(){
		return this.closeReason;
	}

	public void setDefaultSpec(Integer defaultSpec){
		this.defaultSpec = defaultSpec;
	}

	public Integer getDefaultSpec(){
		return this.defaultSpec;
	}

	public void setRecommended(Integer recommended){
		this.recommended = recommended;
	}

	public Integer getRecommended(){
		return this.recommended;
	}

	public void setCateId1(Integer cateId1){
		this.cateId1 = cateId1;
	}

	public Integer getCateId1(){
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

	public void setTag(String tag){
		this.tag = tag;
	}

	public String getTag(){
		return this.tag;
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

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return this.version;
	}

}
