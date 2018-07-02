package com.binzhou.zhy.entity;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class DeliveryAddress implements Serializable {

	/**自动编号 (address_id)**/
	private Long id;

	/**用户编号 (user_id, 用户表自动编号)**/
	private Long userId;

	/**收件人姓名 (realname)**/
	private String name;

	/**联系电话 (telphone)**/
	private String tel;

	/**备用联系电话 (telphone2)**/
	private String tel2;

	/** 国家 (country)**/
	private String country;

	/**省份 (province)**/
	private String province;

	/**城市 (city)**/
	private String city;

	/**地区 (area)**/
	private String area;

	/**街道/详细收货地址 (street)**/
	private String street;

	/**门牌号，详细地址**/
	private String door;

	/**详细地址**/
	private String addre;

	/****/
	private String image1;

	/****/
	private String image2;

	/**邮政编码 (zip)**/
	private String zip;

	/**是否默认收货地址 (is_default_address)**/
	private Integer isDefaultAddress;

	/**创建时间 (created_time)**/
	private java.util.Date gmtCreate;

	/****/
	private java.util.Date gmtModified;

	/****/
	private String creator;

	/****/
	private String modifier;

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

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setTel(String tel){
		this.tel = tel;
	}

	public String getTel(){
		return this.tel;
	}

	public void setTel2(String tel2){
		this.tel2 = tel2;
	}

	public String getTel2(){
		return this.tel2;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return this.country;
	}

	public void setProvince(String province){
		this.province = province;
	}

	public String getProvince(){
		return this.province;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return this.city;
	}

	public void setArea(String area){
		this.area = area;
	}

	public String getArea(){
		return this.area;
	}

	public void setStreet(String street){
		this.street = street;
	}

	public String getStreet(){
		return this.street;
	}

	public void setDoor(String door){
		this.door = door;
	}

	public String getDoor(){
		return this.door;
	}

	public void setAddre(String addre){
		this.addre = addre;
	}

	public String getAddre(){
		return this.addre;
	}

	public void setImage1(String image1){
		this.image1 = image1;
	}

	public String getImage1(){
		return this.image1;
	}

	public void setImage2(String image2){
		this.image2 = image2;
	}

	public String getImage2(){
		return this.image2;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public String getZip(){
		return this.zip;
	}

	public void setIsDefaultAddress(Integer isDefaultAddress){
		this.isDefaultAddress = isDefaultAddress;
	}

	public Integer getIsDefaultAddress(){
		return this.isDefaultAddress;
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

	public void setCreator(String creator){
		this.creator = creator;
	}

	public String getCreator(){
		return this.creator;
	}

	public void setModifier(String modifier){
		this.modifier = modifier;
	}

	public String getModifier(){
		return this.modifier;
	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return this.version;
	}

}
