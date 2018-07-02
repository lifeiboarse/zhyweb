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
	private String cateName;

	/**分类父级ID**/
	private Integer parentId;

	/**排序号**/
	private Integer sortOrder;

	/**是否显示（1显示，0不显示）**/
	private Integer ifShow;

	/****/
	private java.util.Date gmtCreate;

	/****/
	private java.util.Date gmtModified;

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

	public void setCateName(String cateName){
		this.cateName = cateName;
	}

	public String getCateName(){
		return this.cateName;
	}

	public void setParentId(Integer parentId){
		this.parentId = parentId;
	}

	public Integer getParentId(){
		return this.parentId;
	}

	public void setSortOrder(Integer sortOrder){
		this.sortOrder = sortOrder;
	}

	public Integer getSortOrder(){
		return this.sortOrder;
	}

	public void setIfShow(Integer ifShow){
		this.ifShow = ifShow;
	}

	public Integer getIfShow(){
		return this.ifShow;
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

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return this.version;
	}

}
