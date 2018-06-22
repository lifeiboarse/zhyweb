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
	private Integer cateId;

	/**分类名称**/
	private String cateName;

	/**分类父级ID**/
	private Integer parentId;

	/**排序号**/
	private Integer sortOrder;

	/**是否显示（1显示，0不显示）**/
	private Integer ifShow;



	public void setCateId(Integer cateId){
		this.cateId = cateId;
	}

	public Integer getCateId(){
		return this.cateId;
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

}
