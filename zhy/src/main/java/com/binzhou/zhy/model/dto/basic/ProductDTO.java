package com.binzhou.zhy.model.dto.basic;

public class ProductDTO {
	/**商品ID**/
	private Long id;

	/**店铺ID**/
	private Long shopId;

	/**商品所属分类ID**/
	private Long categoryId;

	/****/
	private Long userId;

	/****/
	private Long videoId;

	/****/
	private Integer views;

	/****/
	private java.math.BigDecimal weight;

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

	/****/
	private Long logisticsId;

	/****/
	private Integer numberOrders;

	/****/
	private Integer numberGoodReputation;

	/****/
	private Integer numberFav;

	/****/
	private String recommendStatusStr;

	/****/
	private Integer recommendStatus;

	/****/
	private java.math.BigDecimal pingtuanPrice;

	/****/
	private Boolean pingtuan;

	/****/
	private Integer stores;

	/****/
	private String statusStr;

	/****/
	private Integer paixu;

	/****/
	private String pic;

	/****/
	private java.math.BigDecimal originalPrice;

	/****/
	private Integer minScore;

	/****/
	private java.math.BigDecimal minPrice;

	/****/
	private Integer commissionType;

	/****/
	private Integer commission;

	/****/
	private String characteristic;

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

	/****/
	private String barCode;

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

	/****/
	private String property;

	/****/
	private Integer number;



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

	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	public Long getCategoryId(){
		return this.categoryId;
	}

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return this.userId;
	}

	public void setVideoId(Long videoId){
		this.videoId = videoId;
	}

	public Long getVideoId(){
		return this.videoId;
	}

	public void setViews(Integer views){
		this.views = views;
	}

	public Integer getViews(){
		return this.views;
	}

	public void setWeight(java.math.BigDecimal weight){
		this.weight = weight;
	}

	public java.math.BigDecimal getWeight(){
		return this.weight;
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

	public void setLogisticsId(Long logisticsId){
		this.logisticsId = logisticsId;
	}

	public Long getLogisticsId(){
		return this.logisticsId;
	}

	public void setNumberOrders(Integer numberOrders){
		this.numberOrders = numberOrders;
	}

	public Integer getNumberOrders(){
		return this.numberOrders;
	}

	public void setNumberGoodReputation(Integer numberGoodReputation){
		this.numberGoodReputation = numberGoodReputation;
	}

	public Integer getNumberGoodReputation(){
		return this.numberGoodReputation;
	}

	public void setNumberFav(Integer numberFav){
		this.numberFav = numberFav;
	}

	public Integer getNumberFav(){
		return this.numberFav;
	}

	public void setRecommendStatusStr(String recommendStatusStr){
		this.recommendStatusStr = recommendStatusStr;
	}

	public String getRecommendStatusStr(){
		return this.recommendStatusStr;
	}

	public void setRecommendStatus(Integer recommendStatus){
		this.recommendStatus = recommendStatus;
	}

	public Integer getRecommendStatus(){
		return this.recommendStatus;
	}

	public void setPingtuanPrice(java.math.BigDecimal pingtuanPrice){
		this.pingtuanPrice = pingtuanPrice;
	}

	public java.math.BigDecimal getPingtuanPrice(){
		return this.pingtuanPrice;
	}

	public void setPingtuan(Boolean pingtuan){
		this.pingtuan = pingtuan;
	}

	public Boolean getPingtuan(){
		return this.pingtuan;
	}

	public void setStores(Integer stores){
		this.stores = stores;
	}

	public Integer getStores(){
		return this.stores;
	}

	public void setStatusStr(String statusStr){
		this.statusStr = statusStr;
	}

	public String getStatusStr(){
		return this.statusStr;
	}

	public void setPaixu(Integer paixu){
		this.paixu = paixu;
	}

	public Integer getPaixu(){
		return this.paixu;
	}

	public void setPic(String pic){
		this.pic = pic;
	}

	public String getPic(){
		return this.pic;
	}

	public void setOriginalPrice(java.math.BigDecimal originalPrice){
		this.originalPrice = originalPrice;
	}

	public java.math.BigDecimal getOriginalPrice(){
		return this.originalPrice;
	}

	public void setMinScore(Integer minScore){
		this.minScore = minScore;
	}

	public Integer getMinScore(){
		return this.minScore;
	}

	public void setMinPrice(java.math.BigDecimal minPrice){
		this.minPrice = minPrice;
	}

	public java.math.BigDecimal getMinPrice(){
		return this.minPrice;
	}

	public void setCommissionType(Integer commissionType){
		this.commissionType = commissionType;
	}

	public Integer getCommissionType(){
		return this.commissionType;
	}

	public void setCommission(Integer commission){
		this.commission = commission;
	}

	public Integer getCommission(){
		return this.commission;
	}

	public void setCharacteristic(String characteristic){
		this.characteristic = characteristic;
	}

	public String getCharacteristic(){
		return this.characteristic;
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

	public void setBarCode(String barCode){
		this.barCode = barCode;
	}

	public String getBarCode(){
		return this.barCode;
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

	public void setProperty(String property){
		this.property = property;
	}

	public String getProperty(){
		return this.property;
	}

	public void setNumber(Integer number){
		this.number = number;
	}

	public Integer getNumber(){
		return this.number;
	}
}
