package com.binzhou.zhy.entity;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class Category implements Serializable {

	/**分类自增ID**/
	private Long id;

	/**分类名称**/
	private String name;

	/****/
	private Long userId;

	/**分类父级ID**/
	private Integer parentId;

	/**排序号**/
	private Integer sort;

	/****/
	private Integer key;

	/**是否显示（1显示，0不显示）**/
	private Integer ifShow;

	/****/
	private Boolean isUse;

	/****/
	private String type;

	/****/
	private Integer level;

	/****/
	private String icon;

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

	/****/
	private String version;



	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return this.userId;
	}

	public void setParentId(Integer parentId){
		this.parentId = parentId;
	}

	public Integer getParentId(){
		return this.parentId;
	}

	public void setSort(Integer sort){
		this.sort = sort;
	}

	public Integer getSort(){
		return this.sort;
	}

	public void setKey(Integer key){
		this.key = key;
	}

	public Integer getKey(){
		return this.key;
	}

	public void setIfShow(Integer ifShow){
		this.ifShow = ifShow;
	}

	public Integer getIfShow(){
		return this.ifShow;
	}

	public void setIsUse(Boolean isUse){
		this.isUse = isUse;
	}

	public Boolean getIsUse(){
		return this.isUse;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return this.type;
	}

	public void setLevel(Integer level){
		this.level = level;
	}

	public Integer getLevel(){
		return this.level;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

	public String getIcon(){
		return this.icon;
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
