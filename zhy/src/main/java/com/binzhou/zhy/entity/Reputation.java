package com.binzhou.zhy.entity;
import java.io.Serializable;


/**
 * 
 * 
 * 
 **/
@SuppressWarnings("serial")
public class Reputation implements Serializable {

	/****/
	private Long id;

	/****/
	private String reputation;

	/****/
	private String remark;

	/****/
	private java.util.Date gmtCreate;

	/****/
	private Long orderNo;



	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}

	public void setReputation(String reputation){
		this.reputation = reputation;
	}

	public String getReputation(){
		return this.reputation;
	}

	public void setRemark(String remark){
		this.remark = remark;
	}

	public String getRemark(){
		return this.remark;
	}

	public void setGmtCreate(java.util.Date gmtCreate){
		this.gmtCreate = gmtCreate;
	}

	public java.util.Date getGmtCreate(){
		return this.gmtCreate;
	}

	public void setOrderNo(Long orderNo){
		this.orderNo = orderNo;
	}

	public Long getOrderNo(){
		return this.orderNo;
	}

}
